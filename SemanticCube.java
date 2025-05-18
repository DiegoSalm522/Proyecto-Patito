import java.util.*;

public class SemanticCube {
    private final Map<String, Map<String, Map<String, String>>> cube;

    public SemanticCube() {
        cube = new HashMap<>();

        // Tipos
        String[] types = {"int", "float"};

        for (String left : types) {
            cube.put(left, new HashMap<>());
            for (String right : types) {
                cube.get(left).put(right, new HashMap<>());
            }
        }

        // Aritméticos
        cube.get("int").get("int").put("+", "int");
        cube.get("int").get("int").put("-", "int");
        cube.get("int").get("int").put("*", "int");
        cube.get("int").get("int").put("/", "int");

        cube.get("int").get("float").put("+", "float");
        cube.get("int").get("float").put("-", "float");
        cube.get("int").get("float").put("*", "float");
        cube.get("int").get("float").put("/", "float");

        cube.get("float").get("int").put("+", "float");
        cube.get("float").get("int").put("-", "float");
        cube.get("float").get("int").put("*", "float");
        cube.get("float").get("int").put("/", "float");

        cube.get("float").get("float").put("+", "float");
        cube.get("float").get("float").put("-", "float");
        cube.get("float").get("float").put("*", "float");
        cube.get("float").get("float").put("/", "float");

        // Relacionales
        String[] relOps = {">", "<", "!="};
        for (String op : relOps) {
            cube.get("int").get("int").put(op, "bool");
            cube.get("int").get("float").put(op, "bool");
            cube.get("float").get("int").put(op, "bool");
            cube.get("float").get("float").put(op, "bool");
        }

        // Asignación (solo si tipos iguales o compatibles)
        cube.get("int").get("int").put("=", "int");
        cube.get("float").get("float").put("=", "float");
        cube.get("float").get("int").put("=", "float");
    }

    public String getResultType(String leftType, String rightType, String operator) {
        return cube.containsKey(leftType)
                && cube.get(leftType).containsKey(rightType)
                && cube.get(leftType).get(rightType).containsKey(operator)
                ? cube.get(leftType).get(rightType).get(operator)
                : "error";
    }
}
