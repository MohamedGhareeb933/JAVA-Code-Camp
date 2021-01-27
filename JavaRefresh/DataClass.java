package JavaRefresh;
import java.util.Date;

public class DataClass {

    public static void main(String [] args) {
        Date d = new Date(); // return the Current Date
        Date d3 = new Date(2010, 1, 1);
        Date d2 = new Date(2005, 1, 1);
        Date d1 = new Date(2000, 1, 1);

        boolean a = d1.after(d); // return true date of d2 is after d

        Date FD = new Date(1561554154352l); //  Date of MilliSec After 1970


        System.out.println(FD);
    }
}
