package singleton;


public class SingletonMain {

    public static void main(String [] args) {
        Singleton singleton = Singleton.getInstance("Value");
        System.out.println(singleton.value);
    }

}
