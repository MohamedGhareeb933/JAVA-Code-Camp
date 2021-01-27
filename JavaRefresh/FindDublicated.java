package JavaRefresh;

import java.util.Map;
import java.util.TreeMap;

public class FindDublicated {

    public static int FD(String Input) {

        Map<Character, Integer> GetInput = new TreeMap<>();

        for (int i =0; i <Input.length(); i++){
            if (!GetInput.containsKey(Input.charAt(i))){
                GetInput.put(Input.charAt(i), 0);
            }
            else {
                int finalI = 1;
                GetInput.computeIfPresent(Input.charAt(i), (K, V) -> V  + 1);
            }
        }

        int FinalValue = 0;
        for (Integer i : GetInput.values()){
            if (i > 0){
                FinalValue = i;
                break;
            }
        }

        return FinalValue;
    }
    public static void main(String [] args) {
        String Char = "aaaa";

        System.out.println(FD(Char));
    }
}
