import org.antlr.v4.runtime.*;

public class Main {
  public static void main(String args[]) throws Exception {
    System.out.println("Hello ANTLR");
    CharStream input = CharStreams.fromFileName(args[0]);

    // Lexer creates the tokens
    CalcLexer lexer = new CalcLexer(input);


    CommonTokenStream tokens = new CommonTokenStream(lexer);
    CalcParser parser = new CalcParser(tokens);

    // Uses expr rule from g4 file
    parser.program();

  }
}
