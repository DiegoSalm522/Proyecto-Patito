public class SemanticCubeTest {
    public static void main(String[] args) {
        SemanticCube cube = new SemanticCube();

        // Pruebas
        System.out.println("int + int -> " + cube.getResultType("int", "int", "+")); 
        System.out.println("int - float -> " + cube.getResultType("int", "float", "-")); 
        System.out.println("float * int -> " + cube.getResultType("float", "int", "*")); 
        System.out.println("float / float -> " + cube.getResultType("float", "float", "/")); 
        System.out.println("int = float -> " + cube.getResultType("int", "float", "=")); 
        System.out.println("int < float -> " + cube.getResultType("int", "float", "<"));
        System.out.println("int > float -> " + cube.getResultType("int", "float", ">"));
        System.out.println("float != float -> " + cube.getResultType("float", "float", "!="));
    }
}
