package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {

    private static Logger logger = Logger.getLogger(main.class.toString());

    public static void main(String[] args) {

        List<String> aList = new ArrayList<>();

        aList.add("mohamed");
        aList.add("omar");
        aList.add("g");
        aList.add("c");


        List<String> bList = aList.stream().filter( n -> n.startsWith("o"))
                                                    .collect(Collectors.toList());

        List<String> cList = aList.stream().map( n -> n.toUpperCase())
                                                    .collect(Collectors.toList());
        logger.info("\n" + bList);
        logger.info("\n" + cList);

    }
}
