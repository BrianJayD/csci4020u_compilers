import java.util.regex.*;
import java.io.*;

class PartOne {
  private static Pattern courses, times, rooms, type;
  private static Matcher mc, mt, mr, my;

  public static void main(String args[]) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(
      new FileInputStream("mycampus.html")));

    StringBuilder sb = new StringBuilder();
    String line;
    while ((line = reader.readLine()) != null) {
      sb.append(line).append("\n");
    }

    reader.close();

    /**
    * Extract Course Codes
    */

    courses = Pattern.compile("<th.*(CSCI[\\s\\w-]*)");
    mc = courses.matcher(sb);

    System.out.println("Course Codes:");

    while (mc.find()) {
      System.out.println(mc.group(1));
    }

    /**
    * Extract Times
    */

    times = Pattern.compile("(\\d.*(?:am|pm) - \\d.*(?:am|pm))");
    mt = times.matcher(sb);

    System.out.println("Section Times:");

    while (mt.find()) {
      System.out.println(mt.group(1));
    }

    /**
    * Extract Room
    */

    rooms = Pattern.compile("(?:>(.*Building.*)<)");
    mr = rooms.matcher(sb);

    System.out.println("Rooms:");

    while (mr.find()) {
      System.out.println(mr.group(1));
    }

    /**
    * Extract Schedule Type
    */

    type = Pattern.compile("(?:>(Laboratory|Lecture|Tutorial)<)");
    my = type.matcher(sb);

    System.out.println("Schedule Type:");

    while (my.find()) {
      System.out.println(my.group(1));
    }

  }
}
