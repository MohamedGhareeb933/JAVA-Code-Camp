import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakTheRecords {

    public static void breakingRecords0(List<Integer> scores) {

    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        List<Integer> scoreList = new ArrayList<>();

        int min = 0, max =0, countMin = 0, countMax = 0;
        boolean setups = false;


        for (Integer score : scores) {

            if (!setups) {
                min = score;
                max = score;
                setups = true;
            }

            if (score < min) {
                min = score;
                countMin++;
            }

            if (score > max) {
                max = score;
                countMax++;
            }
        }

        scoreList.add(countMax);
        scoreList.add(countMin);

        return scoreList;
    }


        public static void main(String[] args) {
        List<Integer> score = new ArrayList<>(Arrays.asList(10,5,20,20,4,5,2,25,1));

        List<Integer> fScore =breakingRecords(score);

        System.out.println(fScore);


    }
}
