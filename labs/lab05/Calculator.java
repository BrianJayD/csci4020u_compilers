import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Calculator {
  public static void main(String args[]) throws Exception {
    CharStream input = CharStreams.fromFileName(args[0]);
    VariablesLexer lexer = new VariablesLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    VariablesParser parser = new VariablesParser(tokens);
    ParseTree tree = parser.prog();
    System.out.println(tree.toStringTree(parser));

  }
}
