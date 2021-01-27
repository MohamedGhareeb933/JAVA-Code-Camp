package JavaRefresh;

import java.util.ArrayList;
import java.util.List;

public class ListString {
    public static List<String>[] OutputString(List<String> input) {

        List<String> FinalResult[] = new List[3];
        List<String> A1 = new ArrayList<>();
        List<String> A2 = new ArrayList<>();
        List<String> A3 = new ArrayList<>();

        for (String s : input){
            if (s.charAt(0) == 'a') {
                A1.add(s);
                FinalResult[0] = A1;

            } else if (s.charAt(0) == 'b') {
                A2.add(s);
                FinalResult[1] = A2;

            } else {
                A3.add(s);
                FinalResult[2] = A3;
            }
    }
        return FinalResult;
    }

        public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("cde");
        input.add("abc");
        input.add("bcd");
        input.add("bcasdd");
        input.add("bcvad");
        input.add("awd");
        input.add("bwaws");
        input.add("swawwdw");

        for (List<String> s: OutputString(input)){
            System.out.println(s);
        }
    }
}
