package main;

import org.junit.jupiter.api.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class Test1 {

    @Test
    public void mainTest1() {

        String input = "1\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));

        System.setOut(new PrintStream(new ByteArrayOutputStream()));


    }
}
