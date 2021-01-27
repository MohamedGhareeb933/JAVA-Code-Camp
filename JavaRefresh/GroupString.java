package JavaRefresh;

import java.util.ArrayList;
import java.util.List;

public class GroupString {


    public static List<String[]> OutputString(List<String> input){
        List<String[]> FinalString = new ArrayList<>();

        int indexA = 0;
        int indexB = 0;
        int indexC = 0;

        String AElements[] = new String[input.size()];
        String BElements[] = new String[input.size()];
        String CElement[] = new String[input.size()];

        for (String s : input) {

            if (s.charAt(0) == 'a') {
                 AElements[indexA++] = s;
            }
            else if (s.charAt(0) == 'b') {
                 BElements[indexB++] = s;
            }
            else {
                 CElement[indexC++] = s;
            }
        }

        FinalString.add(AElements);
        FinalString.add(BElements);
        FinalString.add(CElement);

        return FinalString;
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

        for (int i = 0; i < OutputString(input).size(); i++) {
            String Array[] = OutputString(input).get(i);
            for (int a = 0; a < Array.length; a++) {
                if (Array[a] != null)
                System.out.print(Array[a] + " ");
            }
            System.out.println();
        }
    }
}
