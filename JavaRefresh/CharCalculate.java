package JavaRefresh;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CharCalculate {

    public static void main(String [] args) {
        String Input = "ACAX";
        List<String> GetInput = new ArrayList<>();

        for (int i = 0; i <Input.length(); i++) {
            String AddingCharacter = "";

            for (int j = i; j < Input.length(); j++) {
                AddingCharacter += Input.charAt(j);
                GetInput.add(AddingCharacter);
            }
        }

        int Claculate = 0;
        int Dublicate = 0;
        for (int i =0; i <GetInput.size(); i++) {
            List<Character> CalInput = new ArrayList<>();
            for (int j = 0; j <GetInput.get(i).length(); j++) {
                if (!CalInput.contains(GetInput.get(i).charAt(j))) {
                    CalInput.add(GetInput.get(i).charAt(j));
                }else{
                    Dublicate++;
                }
            }
            Claculate += CalInput.size();
        }

        System.out.println(Claculate - Dublicate);
    }
}
