import org.antlr.v4.runtime.*;

public class ScannerTest {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromFileName("test.pat");
        Patito lexer = new Patito(input);

        Token token = lexer.nextToken();
        while (token.getType() != Token.EOF) {
            System.out.println(
                token.getText() + " -> " +
                lexer.getVocabulary().getSymbolicName(token.getType())
            );
            token = lexer.nextToken();
        }
    }
}
