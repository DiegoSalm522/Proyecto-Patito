import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.ParserRuleContext;
import java.util.*;

public class SemanticAnalyzer extends PatitoBaseVisitor<Void> {

    private final FunctionDirectory funcDir = new FunctionDirectory();
    private final SemanticCube cube = new SemanticCube();
    private FunctionInfo currentFunction = null;
    private final List<String> semanticErrors = new ArrayList<>();

    @Override
    public Void visitPrograma(PatitoParser.ProgramaContext ctx) {
        funcDir.addFunction("global", "void");
        currentFunction = funcDir.getFunction("global");

        if (ctx.vars() != null) visit(ctx.vars());

        currentFunction = null;

        if (ctx.funcs() != null) visit(ctx.funcs());

        if (ctx.bloque() != null) {
            funcDir.addFunction("main", "void");
            currentFunction = funcDir.getFunction("main");
            visit(ctx.bloque());
            currentFunction = null;
        }

        return null;
    }

    @Override
    public Void visitFuncion(PatitoParser.FuncionContext ctx) {
        String name = ctx.ID().getText();
        try {
            funcDir.addFunction(name, "void");
            currentFunction = funcDir.getFunction(name);
        } catch (RuntimeException e) {
            addError(ctx, e.getMessage());
            return null;
        }

        if (ctx.parametros() != null) visit(ctx.parametros());
        if (ctx.vars() != null) visit(ctx.vars());
        visit(ctx.bloque());

        currentFunction = null;
        return null;
    }

    @Override
    public Void visitVarsDecl(PatitoParser.VarsDeclContext ctx) {
        String type = ctx.tipo().getText();
        for (TerminalNode id : ctx.ID()) {
            String varName = id.getText();
            try {
                currentFunction.addVariable(varName, type);
            } catch (RuntimeException e) {
                addError(ctx, e.getMessage());
            }
        }
        return null;
    }

    @Override
    public Void visitParametro(PatitoParser.ParametroContext ctx) {
        String paramName = ctx.ID().getText();
        String type = ctx.tipo().getText();
        try {
            currentFunction.addParameter(paramName, type);
        } catch (RuntimeException e) {
            addError(ctx, e.getMessage());
        }
        return null;
    }

    @Override
    public Void visitAsignacion(PatitoParser.AsignacionContext ctx) {
        String varName = ctx.ID().getText();
        VariableInfo var = lookupVariable(ctx, varName);
        if (var == null) return null;

        String rightType = evaluateExpression(ctx.expresion());
        if (rightType.equals("error")) return null;

        String result = cube.getResultType(var.type, rightType, "=");
        if (result.equals("error")) {
            addError(ctx, "Error de tipos: no se puede asignar " + rightType + " a " + var.type);
        }
        return null;
    }

    @Override
    public Void visitLlamadaFunc(PatitoParser.LlamadaFuncContext ctx) {
        String funcName = ctx.ID().getText();
        FunctionInfo calledFunc = funcDir.getFunction(funcName);

        if (calledFunc == null) {
            addError(ctx, "Funcion no declarada: " + funcName);
            return null;
        }

        List<VariableInfo> params = calledFunc.getParameters();
        List<PatitoParser.ExpresionContext> args = ctx.argumentos() != null ? ctx.argumentos().expresion() : new ArrayList<>();

        if (args.size() != params.size()) {
            addError(ctx, "Error: numero incorrecto de argumentos en llamada a " + funcName);
            return null;
        }

        for (int i = 0; i < args.size(); i++) {
            String argType = evaluateExpression(args.get(i));
            if (argType.equals("error")) continue;

            String paramType = params.get(i).type;
            String result = cube.getResultType(paramType, argType, "=");
            if (result.equals("error")) {
                addError(ctx, "Error de tipo en parametro " + (i + 1) + ": se esperaba " + paramType + ", pero se recibio " + argType);
            }
        }

        return null;
    }

    @Override
    public Void visitFactor(PatitoParser.FactorContext ctx) {
        if (ctx.ID() != null) {
            lookupVariable(ctx, ctx.ID().getText());
        }
        return visitChildren(ctx);
    }

    @Override
    public Void visitCondicion(PatitoParser.CondicionContext ctx) {
        evaluateExpression(ctx.expresion());
        visit(ctx.bloque(0));
        if (ctx.bloque().size() > 1) {
            visit(ctx.bloque(1));
        }
        return null;
    }

    private VariableInfo lookupVariable(ParserRuleContext ctx, String name) {
        if (currentFunction != null && currentFunction.getVariable(name) != null) {
            return currentFunction.getVariable(name);
        }
        FunctionInfo global = funcDir.getFunction("global");
        if (global != null && global.getVariable(name) != null) {
            return global.getVariable(name);
        }
        addError(ctx, "Variable no declarada: " + name);
        return null;
    }

    private String evaluateExpression(PatitoParser.ExpresionContext ctx) {
        String left = evaluateExp(ctx.exp(0));
        if (left.equals("error")) return "error";

        if (ctx.exp().size() == 2) {
            String right = evaluateExp(ctx.exp(1));
            String op = ctx.getChild(1).getText();
            String result = cube.getResultType(left, right, op);
            if (result.equals("error")) {
                addError(ctx, "Error de tipos: " + left + " " + op + " " + right);
                return "error";
            }
            return result;
        }
        return left;
    }

    private String evaluateExp(PatitoParser.ExpContext ctx) {
        String result = evaluateTermino(ctx.termino(0));
        for (int i = 1; i < ctx.termino().size(); i++) {
            String right = evaluateTermino(ctx.termino(i));
            String op = ctx.getChild(i * 2 - 1).getText();
            result = cube.getResultType(result, right, op);
            if (result.equals("error")) {
                addError(ctx, "Error de tipos: " + result + " " + op + " " + right);
                return "error";
            }
        }
        return result;
    }

    private String evaluateTermino(PatitoParser.TerminoContext ctx) {
        String result = evaluateFactor(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            String right = evaluateFactor(ctx.factor(i));
            String op = ctx.getChild(i * 2 - 1).getText();
            result = cube.getResultType(result, right, op);
            if (result.equals("error")) {
                addError(ctx, "Error de tipos: " + result + " " + op + " " + right);
                return "error";
            }
        }
        return result;
    }

    private String evaluateFactor(PatitoParser.FactorContext ctx) {
        if (ctx.ID() != null) {
            VariableInfo var = lookupVariable(ctx, ctx.ID().getText());
            return var != null ? var.type : "error";
        } else if (ctx.CTE_INT() != null) {
            return "int";
        } else if (ctx.CTE_FLOAT() != null) {
            return "float";
        } else if (ctx.CTE_STRING() != null) {
            return "string";
        } else if (ctx.expresion() != null) {
            return evaluateExpression(ctx.expresion());
        }
        return "error";
    }

    private void addError(ParserRuleContext ctx, String msg) {
        int line = ctx.getStart().getLine();
        int pos = ctx.getStart().getCharPositionInLine();
        semanticErrors.add(String.format("Linea %d:%d - %s", line, pos, msg));
    }

    public boolean hasErrors() {
        return !semanticErrors.isEmpty();
    }

    public void printErrors() {
        System.out.println("Errores semanticos encontrados:");
        for (String err : semanticErrors) {
            System.out.println(" - " + err);
        }
    }

    public String getFunctionDirectory() {
        return funcDir.toString();
    }
}
