package DateFormats;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example2 {

    public static SimpleDateFormat formater = new SimpleDateFormat("dd/mm/yyy");

    public static Date parseDate(String dateStr) throws ParseException {
        Date date = formater.parse(dateStr);

        return date;
    }

    public static String dateToString(Date date){
        String result = "";

        if (date != null){
            result = formater.format(date);
        }

        return result;
    }

    public static void main(String[] args){
        String dateOfBirth = "31/11/2020";
        try {
            Date date =  parseDate(dateOfBirth);
            System.out.println(dateToString(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
