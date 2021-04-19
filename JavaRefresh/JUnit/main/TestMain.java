package main;
import cases.Cal;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;



public class TestMain {


    @Test
    public void additionTestOfTwoArg(int a) {

        String input = "1" + "\n" + "1";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // invoke main method.
        String[] args = {};
        Cal.main(args);

        assertEquals(2, out.toString());

    }

    /**
    @Test
    public void multiplyTestOfTwoArg() {
        int mulReturn = m.add(10, 10);

        assertEquals( 20 , mulReturn, "must return 100");
    }
    */
}
