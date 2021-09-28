package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Example1 {

    private static Logger logger = Logger.getLogger(Example1.class.toString());

    public static void main(String[] args) {

        List<String> aList = new ArrayList<>(Arrays.asList("mohamed", "omar", "g", "c"));


        List<String> bList = aList.stream().filter( n -> n.startsWith("o"))
                                                    .collect(Collectors.toList());

        List<String> cList = aList.stream().map( n -> n.toUpperCase())
                                                    .collect(Collectors.toList());
        logger.info("\n" + bList);
        logger.info("\n" + cList);

    }
}
