import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ParserTest {
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
            System.out.println("Analisis sintactico exitoso.");
            System.out.println("Arbol generado:");
            System.out.println(tree.toStringTree(parser));
        } else {
            System.out.println("Se encontraron errores de sintaxis.");
        }
    }
}
