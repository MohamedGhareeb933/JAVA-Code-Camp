package cases;

import java.util.Scanner;
import java.util.logging.Logger;

public class Cal {

    Logger logger = Logger.getLogger(Cal.class.getName());

    public int add(int a) { return  a + 10; }

    public int mul(int a, int b) { return  a * b; }


    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print(a + b);

    }


}
