import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("---------- ASSIGNMENT 2 ----------\n");

    CharStream inputFile = CharStreams.fromFileName(args[0]);

    PLLexer lexer = new PLLexer(inputFile);

    CommonTokenStream tokens = new CommonTokenStream(lexer);

    PLParser parser = new PLParser(tokens);

    ParseTree sectionTree = parser.prog();
    System.out.println(sectionTree.toStringTree(parser));

  }
}
