package cases;

import com.sun.istack.internal.logging.Logger;
import jdk.internal.util.xml.impl.Input;
import main.TestMain;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.TestWatcher;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Cal {

    static Logger logger = Logger.getLogger(Cal.class);

    public int add(int a) { return  a + 10; }

    public int mul(int a, int b) { return  a * b; }


    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print(a + b);

    }


}
