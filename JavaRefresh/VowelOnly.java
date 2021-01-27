package JavaRefresh;

public class VowelOnly {

    public static String Vowel(String VInput) {
        char charArray[] = {'a', 'e', 'i', 'o', 'h', 'y'};
        StringBuilder AddToString = new StringBuilder();
        for (char s : VInput.toCharArray()) {
            for (int i = 0; i <charArray.length; i++) {
                if (s == charArray[i]) {
                    AddToString.append(s);
                }
            }
        }
        return AddToString.toString();
    }


    public static String Vowell(String VInput) {
        String Vowel = "aeiou";
        StringBuilder sb = new StringBuilder();
        for (char s : VInput.toCharArray()){
            if (Vowel.contains(String.valueOf(s).toLowerCase())) {
                sb.append(s);
            }
        }

        return sb.toString();
    }

    public static void main(String [] args) {
        String Example = "Learning";
        System.out.println(Vowel(Example));
    }
}
