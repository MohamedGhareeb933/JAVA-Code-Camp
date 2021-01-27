package DateFormats;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

public class Example {
    public static void main(String[] args){

      Date today;
      String output;
      SimpleDateFormat formatter;

      formatter = new SimpleDateFormat("EEE, dd MMM yyy");
      today = new Date();
      output = formatter.format(today);
      System.out.println(output + " \n" + formatter);
    }
}
