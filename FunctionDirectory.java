import java.util.*;

public class FunctionDirectory {
    private final Map<String, FunctionInfo> functions = new HashMap<>();

    public void addFunction(String name, String returnType) {
        if (functions.containsKey(name)) {
            throw new RuntimeException("Funcion ya declarada: " + name);
        }
        functions.put(name, new FunctionInfo(name, returnType));
    }

    public FunctionInfo getFunction(String name) {
        return functions.get(name);
    }

    public Collection<FunctionInfo> getAllFunctions() {
        return functions.values();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("=== Directorio de Funciones ===\n");
        for (FunctionInfo f : functions.values()) {
            sb.append(f).append("\n");
        }
        return sb.toString();
    }
}
