package Main;

import java.beans.Customizer;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example2 {

    public static Logger logger = Logger.getLogger(Example2.class.getName());

    public static void streamExample1(List<String> customer) {

        customer.stream().filter(c -> c.startsWith("m")).map(String::toUpperCase).sorted().forEach(c -> System.out.println(c));
    }

    public static List<String> streamExample2(List<String> customer) {

        return IntStream.range(0, customer.size()).map(i -> customer.size() - i - 1).mapToObj(i -> customer.get(i)).collect(Collectors.toList());

    }

    public static void streamExample3(List<String> customer) {

        Stream.of("mohamed", customer ).findFirst().ifPresent(c -> logger.info(c.toString()));

    }

    public static void intStreamExample(List<String> customer) {

        IntStream.range(0, customer.size()).forEach(c -> logger.info("" + c));
    }

    public static void arrayStreamExample(List<String> customer) {
        Arrays.stream(new int[] {1, 2, 3}).map(n -> n * 2).average().ifPresent(c -> logger.info("" + c));
    }


    public static void mapStreamExample(List<String> customer) {
        Stream.of("a1", "a2", "a3").map(c -> c.substring(1)).mapToInt(Integer::parseInt).max().ifPresent(c -> logger.info("" + c));
    }

    public static void maptoObject(List<String> customer) {
        IntStream.range(0, 4).mapToObj(c -> "a" + c).forEach(System.out::println);
    }

    public static void maptoObject2(List<String> customer) {
        Stream.of(1.0, 2.0, 3.0, 4.1).mapToInt(Double::intValue).forEach(System.out::println);
    }

        public static void main(String [] args) {

        List<String> customer = Arrays.asList("mohamed", "ahmed", "mohamed@gmail.com", "01205705626");

        //customer.stream().forEach(c -> IntStream.range(customer.size() - 1, 0));

        //streamExample1(customer);

        //List<String> customerInfo = streamExample2(customer);
        //logger.info("" + customerInfo);

        //streamExample3(customer);

        //intStreamExample(customer);

        //arrayStreamExample(customer);

           //mapStreamExample(customer);

            //maptoObject(customer);
            //maptoObject2(customer);
    }
}
