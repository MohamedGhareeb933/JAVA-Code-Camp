package main;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.stream.StreamSupport;

public class main {

    static Logger logger = Logger.getLogger(main.class.toString());

    static Scanner scanner ;

    public static void main(String[] args) {

        try {

            logger.info("Test line sperator" + System.getProperty("line.separator") + "continue Test");

            String input = String.valueOf(scanner.nextLine());

            System.setIn(new ByteArrayInputStream(input.getBytes()));

            logger.info("" + (char)System.in.read());

        }catch(Exception e) {

            e.printStackTrace();

        }finally {

        }

    }
}
