package singleton;

public class Singleton {

    private static Singleton singleton;
    public String value;

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (singleton == null) {
            singleton = new Singleton(value);
        }
        return singleton;
    }
}
