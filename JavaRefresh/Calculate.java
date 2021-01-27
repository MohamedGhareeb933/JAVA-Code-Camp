package JavaRefresh;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Calculate {

    /*public static int calculate(String S) {
        int leftOperation = 0;
        int rightoperation = 0;
        int MathOperation = 0;

        for (int i = 0; i <S.length(); i++){
            try{
                Integer.parseInt(String.valueOf(S.charAt(i)));
            }catch (NumberFormatException nfe) {
                MathOperation = i;
                leftOperation = Integer.parseInt(S.substring(0, MathOperation));
                rightoperation = Integer.parseInt(S.substring(MathOperation + 1));
            }
        }

        if (S.charAt(MathOperation) == '+') {
            return leftOperation + rightoperation ;
        }else if (S.charAt(MathOperation) == '*') {
            return leftOperation * rightoperation ;
        }else if (S.charAt(MathOperation) == '-') {
            return leftOperation - rightoperation ;
        }else if (S.charAt(MathOperation) == '/') {
            return leftOperation / rightoperation ;
        }else {
            return leftOperation % rightoperation ;
        }

    }*/

    public static int calculate(String S) {

        int num = 0;
        char sign = '+';
        Stack<Integer> pushinto = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            if (Character.isDigit(S.charAt(i))) {
                num = num * 10 + S.charAt(i) - '0';
            }
            if (!Character.isDigit(S.charAt(i)) || i < S.length()){
                if (sign == '+') {
                    pushinto.push(num);
                }
                if (sign == '-'){
                    pushinto.push(-num);
                }
                if (sign  == '*'){
                    pushinto.push(pushinto.pop() * num);
                }

                sign = S.charAt(i);
                num =0;
            }
        }

        int cal = 0;
        for (int i: pushinto){
            cal += i;
        }

        return cal;
    }


    public static void main(String [] args) {

        System.out.println(calculate("2*3"));
    }
}
