package JavaRefresh;

import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class WordFrequency {

    public static Map<String, Integer> CountInput(String[] Input) {
        Map<String, Integer> Count = new TreeMap<>();

        for (int i = 0; i < Input.length; i++) {
            if (!Count.containsKey(Input[i])){
                Count.put(Input[i], 1);
            }else {
                Count.computeIfPresent(Input[i], (K, V) -> V + 1);
            }
        }
        return Count;
    }

    public static void main(String [] args) {
        String Input[] = {"abc", "bcd", "abc", "abc", "bcd", "csdas", "csdas"};

        System.out.println(CountInput(Input));
    }
}
