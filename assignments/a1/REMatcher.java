import java.io.*;

class REMatcher {

  public static void main(String args[]) throws IOException {
    //System.out.println(oneString(args[0]));

    String htmlCode = oneString(args[0]);
    rem(htmlCode);

  }

  public static String oneString(String html) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(
      new FileInputStream(html)));

    StringBuilder builder = new StringBuilder();
    String line;
    while((line = reader.readLine()) != null) {
      builder.append(line);
    }
    reader.close();

    return builder.toString();

  }

  public static void rem(String s) {

    int index = 0;

    String substring = "";

    for (int i = 0; i < s.length(); i++ ) {
      substring = addChar(s.charAt(i), substring);
      System.out.println(i + " : " + s.charAt(i) + "\t\tsb=" + substring);
    }
  }

  public static String addChar(char charCheck, String sb) {
    StringBuilder cBuild = new StringBuilder();

    if (charCheck == 'C' && ((sb == "") || (sb == "CS"))) {
      cBuild.append("C");
      return cBuild.toString();
    }
    if (charCheck == 'S' && sb == "C") {
      cBuild.append("S");
      return cBuild.toString();
    }

    return "";
  }


}
