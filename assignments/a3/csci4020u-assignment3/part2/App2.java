import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class App2 {
  public static void main(String args[]) throws Exception {
    CharStream input = CharStreams.fromFileName(args[0]);
    Calc2Lexer lexer = new Calc2Lexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    Calc2Parser parser = new Calc2Parser(tokens);
    ParseTree tree = parser.prog();
    //System.out.println(tree.toStringTree(parser));
  }
}
