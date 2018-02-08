import java.util.regex.*;
import java.io.*;

class ListComponent {
  private static Pattern courses, times, rooms, type;
  private static Matcher mc, mt, mr, my;

  /**
  * Regular expressions
  */
  private static final String REGEX_COURSE = "<th.*(CSCI[\\s\\w-]*)";
  private static final String REGEX_TIME = "(\\d.*(?:am|pm) - \\d.*(?:am|pm))";
  private static final String REGEX_ROOM = "(?:>(.*Building.*)<)";
  private static final String REGEX_SCHEDULE = "(?:>(Laboratory|Lecture|Tutorial)<)";

  public static void main(String args[]) throws IOException {

    String comp = getComponents(args[0]);

    System.out.println(comp);

  }

  public static String getComponents(String html) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(
      new FileInputStream(html)));

    courses = Pattern.compile(REGEX_COURSE);
    times = Pattern.compile(REGEX_TIME);
    rooms = Pattern.compile(REGEX_ROOM);
    type = Pattern.compile(REGEX_SCHEDULE);

    StringBuilder builder = new StringBuilder();
    String line;
    while((line = reader.readLine()) != null) {
      //builder.append(line).append("\n");
      mc = courses.matcher(line);
      mt = times.matcher(line);
      mr = rooms.matcher(line);
      my = type.matcher(line);

      if (mc.find()) {
        builder.append("<Course Code>: <").append(mc.group(1)).append(">\n");
      } else if (mt.find()) {
        builder.append("<Time>: <").append(mt.group(1)).append(">\n");
      } else if (mr.find()) {
        builder.append("<Room>: <").append(mr.group(1)).append(">\n");
      } else if (my.find()) {
        builder.append("<Schedule Type>: <").append(my.group(1)).append(">\n");
      }
    }
    reader.close();

    return builder.toString();

  }
}
