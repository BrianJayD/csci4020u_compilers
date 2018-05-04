import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

class Main {
  public static void main(String[] args) throws Exception {

    CharStream input = CharStreams.fromFileName(args[0]);

    FuncLexer lexer = new FuncLexer(input);

    CommonTokenStream tokens = new CommonTokenStream(lexer);

    FuncParser parser = new FuncParser(tokens);

    ParseTree tree = parser.program();
    System.out.println(tree.toStringTree(parser));

  }
}
