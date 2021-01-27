package TestExceptions;

public class main {

    public static void someString() throws Exception {
        String alpha = null;
        alpha.toString();
    }
    public static void main(String[] args) throws Exception {

        try{
            someString();
        }catch (Exception exc) {
            exc.printStackTrace();
            throw new NullPointerException(" invalid method ");
        }
    }
}
