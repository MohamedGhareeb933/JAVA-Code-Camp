package JavaRefresh;
import java.lang.String;


public class Strings {

    public static void main(String [] args) {
        String name = "Mohamed";
        StringBuilder StringBuild = new StringBuilder("good Morning"); // OR StringBuffer
        StringBuild.append(" Mr " + name); // addend add String to the Last

        System.out.print(StringBuild);
    }
}
