import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


class Main {
  public static void main(String args[]) throws Exception {
    CharStream input = CharStreams.fromFileName(args[0]);
    FactorLexer lexer = new FactorLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    FactorParser parser = new FactorParser(tokens);
    ParseTree tree = parser.prog();
    System.out.println(tree.toStringTree(parser));
  }
}
