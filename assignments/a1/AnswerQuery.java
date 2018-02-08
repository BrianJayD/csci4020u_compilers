import java.util.regex.*;
import java.io.*;
import java.util.Scanner;

class AnswerQuery {

  private static final String REGEX_UL = "(UL4)";
  private static final String REGEX_CODE = "(CSCI[\\s\\d\\w-]*)";
  private static String courseCode;

  public static void main(String args[]) throws IOException {
    String components = ListComponent.getComponents(args[0]);

    answer(components);

  }

  public static String answer(String comp) {

    Pattern code = Pattern.compile(REGEX_CODE);
    Pattern ul = Pattern.compile(REGEX_UL);

    String[] lines = comp.split("\\n");
    for(String s: lines){

      Matcher mCode = code.matcher(s);
      Matcher mUl = ul.matcher(s);

      if (mCode.find() && courseCode == null) {
        courseCode = mCode.group(0);
        //System.out.println(courseCode);
      } else if (mUl.find()) {
        System.out.println(courseCode);
      }

    }

    return "";

  }



}
