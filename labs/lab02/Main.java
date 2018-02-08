import org.antlr.v4.runtime.*;

class Main {
  public static void main(String args[]) throws Exception {
    CharStream input = CharStreams.fromFileName(args[0]);

    CommonTokenStream tokenStream = new CommonTokenStream(new Hello(input));

    tokenStream.fill();

    for (Token t : tokenStream.getTokens()) {
      print(t);
    }
  }

  public static void print(Token t) {
    int type = t.getType();
    if(type > 0 && type != Hello.Whitespace) {
      String rulename = Hello.ruleNames[t.getType()-1];
      System.out.println(rulename + ": " + t.getText());
    }
  }

}
