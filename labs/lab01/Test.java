import java.util.regex.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class Test {
  public static void main(String[] args) throws IOException {
    HashMap<String, Integer> schools = new HashMap<String, Integer>();

    BufferedReader reader = new BufferedReader(
      new InputStreamReader(
        new FileInputStream("nserc-2017.html")));

    StringBuilder content = new StringBuilder();
    String line;
    while((line = reader.readLine()) != null)
    content.append(line).append("\n");
    reader.close();

    Pattern pattern = Pattern.compile(">\\$(.*)</td>");



    Matcher m = pattern.matcher(content);


    long total = 0L;
    String convert = "";
    while(m.find()) {
      convert = Integer.toString(m.group(1).charAt(0)) + Integer.toString(m.group(1).charAt(1)) +Integer.toString(m.group(1).charAt(3)) +Integer.toString(m.group(1).charAt(4)) +Integer.toString(m.group(1).charAt(5));

      //System.out.println(m.group(1));
      total = total + ((Long.valueOf(convert)));

      if (!schools.containsKey(m.group(1))) {
        schools.put(m.group(1), 1);
      } else {
        schools.put(m.group(1), schools.get(m.group(1)) + 1);
      }
    }

    System.out.println(total);

    for (Map.Entry<String, Integer> entry : schools.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println(key + " " + value);
      // ...
    }
  }
}
