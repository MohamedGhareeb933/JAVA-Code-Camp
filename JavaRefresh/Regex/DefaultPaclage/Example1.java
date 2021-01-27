package DefaultPaclage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {

    public static void regexExmaple1(){
        String name = ".c";
        String Exist = "ac";

        // 1st way
        Pattern p = Pattern.compile(name);
        Matcher m = p.matcher(Exist);

        System.out.println(m.matches());

        //2nd way

        boolean b2 = Pattern.compile(name).matcher(Exist).matches();
        System.out.println(b2);

        //3rd way
        boolean b3 = Pattern.matches(name, Exist);
        System.out.println(b3);



    }

    public static void regexExample2() {

        boolean a = Pattern.matches("[a-zA-Z0-p]{5}", "a23we");

        System.out.println(a);
    }

    public static void main(String [] args){
        //regexExmaple1();

        regexExample2();
    }
}
