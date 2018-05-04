import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;

class Main {
  public static void main(String[] args){
    System.out.println("---------- ASSIGNMENT 2 ----------\nErrors:");

    try {
      CharStream inputFile = CharStreams.fromFileName(args[0]);

      PLLexer lexer = new PLLexer(inputFile);

      CommonTokenStream tokens = new CommonTokenStream(lexer);

      PLParser parser = new PLParser(tokens);

      // Sets parse tree and runs the parser.program() method 
      ParseTree pTree = parser.program();

      // Prints out parse tree
      System.out.println("Parse Tree:\n" + pTree.toStringTree(parser));

    } catch (IOException e) {
      System.out.println(e);
    } catch (RecognitionException re) {
      System.err.println(re);
    }
  }
}
