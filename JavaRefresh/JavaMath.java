package JavaRefresh;
import java.lang.Math;

public class JavaMath {

    public static void main(String [] args) {
        double a = Math.abs(-7.464); // returing positive number
        int b = Math.addExact(10, 57); // adding two numbers
        double c = Math.ceil(46.01); // 0.1 increased to most close upper number
        double d = Math.floor(46.79); // removing the fraction and returning the true number
        double e = Math.rint(79.164); // integer value of double.
        double f = Math.round(79.244); // long value of double
        double g = Math.max(10, 20); // compare and return Max Number
        double h = Math.min(20, 30); // compare and return Min Number
        double i = Math.pow(2, 2); // return the power of 2 by 2
        double p = Math.sqrt(9); // return the square root
        double r = Math.random(); // return the value between 0.01 and 0.99
        System.out.print(r);
    }
}
