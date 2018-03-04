import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("---------- Midterm ----------\n");

    CharStream input = CharStreams.fromFileName(args[0]);

    MidtermLexer lexer = new MidtermLexer(input);

    CommonTokenStream tokens = new CommonTokenStream(lexer);

    MidtermParser parser = new MidtermParser(tokens);

    ParseTree sectionTree = parser.object();
    System.out.println(sectionTree.toStringTree(parser));

  }
}
