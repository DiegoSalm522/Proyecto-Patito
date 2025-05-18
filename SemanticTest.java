import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SemanticTest {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("test.pat");
        PatitoLexer lexer = new PatitoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PatitoParser parser = new PatitoParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new DiagnosticErrorListener());
        parser.addErrorListener(new ConsoleErrorListener());

        ParseTree tree = parser.programa();

        if (parser.getNumberOfSyntaxErrors() == 0) {
            SemanticAnalyzer analyzer = new SemanticAnalyzer();
            analyzer.visit(tree);
            if (analyzer.hasErrors()) {
                analyzer.printErrors();
            } else {
                System.out.println(analyzer.getFunctionDirectory());
                System.out.println("Analisis semantico exitoso");
            }
        } else {
            System.out.println("Se encontraron errores de sintaxis.");
        }
    }
}
