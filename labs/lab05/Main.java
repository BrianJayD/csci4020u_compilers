import org.antlr.v4.runtime.*;

public class Main {
  public static void main(String args[]) throws Exception {
    CharStream input = CharStreams.fromFileName(args[0]);
    CsvLexer lexer = new CsvLexer(input);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    CsvParser parser = new CsvParser(tokens);
    parser.col = Integer.parseInt(args[1]);
    parser.file();
  }
}
