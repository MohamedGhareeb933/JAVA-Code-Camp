package JavaRefresh;

public class fibonacciSequance {

    public static int Test1(int a) {
        if (a <= 1) return a;
        return Test1(a-  1) + Test1(a - 2);
    }

    public static void main(String [] args) {
        int t = 6;

        System.out.println(Test1(t));
    }
}
