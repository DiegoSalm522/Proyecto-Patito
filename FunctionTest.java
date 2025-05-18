public class FunctionTest {
    public static void main(String[] args) {
        FunctionDirectory dir = new FunctionDirectory();

        // Agregar función global (main)
        dir.addFunction("main", "void");
        FunctionInfo main = dir.getFunction("main");
        main.addVariable("x", "int");
        main.addVariable("mensaje", "string");

        // Agregar función con parámetros
        dir.addFunction("sumar", "int");
        FunctionInfo sumar = dir.getFunction("sumar");
        sumar.addParameter("a", "int");
        sumar.addParameter("b", "int");
        sumar.addVariable("resultado", "int");

        System.out.println(dir);
    }
}
