import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class App1 {
  public static void main(String args[]) throws Exception {
    CharStream input = CharStreams.fromFileName(args[0]);
    Calc1Lexer lexer = new Calc1Lexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    Calc1Parser parser = new Calc1Parser(tokens);
    ParseTree tree = parser.prog();
    //System.out.println(tree.toStringTree(parser));
  }
}
