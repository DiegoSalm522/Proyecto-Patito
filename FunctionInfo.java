import java.util.*;

public class FunctionInfo {
    public final String name;
    public final String returnType;
    private final List<VariableInfo> parameters = new ArrayList<>();
    private final Map<String, VariableInfo> variables = new HashMap<>();

    public FunctionInfo(String name, String returnType) {
        this.name = name;
        this.returnType = returnType;
    }

    public void addParameter(String paramName, String type) {
        if (variables.containsKey(paramName)) {
            throw new RuntimeException("Variable ya declarada: " + paramName);
        }
        VariableInfo var = new VariableInfo(paramName, type, true);
        parameters.add(var);
        variables.put(paramName, var);
    }

    public void addVariable(String varName, String type) {
        if (variables.containsKey(varName)) {
            throw new RuntimeException("Variable ya declarada: " + varName);
        }
        VariableInfo var = new VariableInfo(varName, type, false);
        variables.put(varName, var);
    }

    public VariableInfo getVariable(String name) {
        return variables.get(name);
    }

    public List<VariableInfo> getParameters() {
        return parameters;
    }

    public Collection<VariableInfo> getAllVariables() {
        return variables.values();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Funcion: %s : %s%n", name, returnType));
        sb.append("  Parametros:\n");
        for (VariableInfo p : parameters) {
            sb.append("    ").append(p).append("\n");
        }
        sb.append("  Variables locales:\n");
        for (VariableInfo v : variables.values()) {
            if (!v.isParameter) {
                sb.append("    ").append(v).append("\n");
            }
        }
        return sb.toString();
    }
}
