import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class main {

    public static Logger logger = Logger.getLogger(main.class.toString());

    public static List<Integer> gradingStudents(List<Integer> gradeLIst) {

        List<Integer> grades = new ArrayList<>();

        gradeLIst.stream().forEach(c -> {
            int prevGrade = c;
            while (c % 5 != 0 && c > 35) {
               c++;
            }
            if (c - prevGrade < 3) {
                grades.add(c);
            }else {
                grades.add(prevGrade);
            }
                });


        return grades;
    }


    public static List<Integer> newGradingStudents(List<Integer> gradeLIst) {

        List<Integer> grades = new ArrayList<>();

        gradeLIst.stream().forEach(c -> {
            if ( (c % 5) < 3) {
                grades.add(c + (c % 5) );
            }else {
                grades.add(c);
            }
        });


        return grades;
    }

    public static void main(String [] args) {

        logger.info(""+ newGradingStudents(new ArrayList<>(Arrays.asList(73, 67, 38, 33))));

    }
}
