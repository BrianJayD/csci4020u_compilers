import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

class Main {
  public static void main(String[] args) throws Exception {
    System.
    out.println("-----Lab 03-----");

    CharStream input = CharStreams.fromFileName(args[0]);

    CalcLexer lexer = new CalcLexer(input);

    CommonTokenStream tokens = new CommonTokenStream(lexer);

    CalcParser parser = new CalcParser(tokens);

    ParseTree tree = parser.prog();
    System.out.println(tree.toStringTree(parser));

  }
}
