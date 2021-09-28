package Main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAssess {

    public static List<String> Assess1(List<String> customer) {

        return IntStream.range(0, customer.size())
                .map(i -> customer.size() - i - 1)
                .mapToObj(i -> customer.get(i))
                .collect(Collectors.toList());

    }

    public static void main(String [] args) {

        List<String> customer = Arrays.asList("mohamed", "ahmed", "mohamed@gmail.com", "01205705626");

        System.out.println(Assess1(customer));
    }

}
