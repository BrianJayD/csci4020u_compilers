import java.util.regex.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class HtmlFinder {
  public static void main(String args[]) throws IOException {
    HashMap <String, Integer> schools = new HashMap<String, Integer>();

    BufferedReader reader = new BufferedReader(new InputStreamReader(
      new FileInputStream("nserc-2017.html")));

    StringBuilder content = new StringBuilder();
    String line;
    while ((line = reader.readLine()) != null) {
      content.append(line).append("\n");
    }
    reader.close();

    Pattern pattern = Pattern.compile(">(.*)</td>");

    Matcher m = pattern.matcher(content);

    long total = 0L;
    String convert = "";
    while (m.find()) {
      System.out.println(m.group(1));
    }

  }
}
