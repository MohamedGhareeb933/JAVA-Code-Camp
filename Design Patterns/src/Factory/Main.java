
package PackageTest;

public class Main {

    public static void client(dialog d) {
        d.ButtonCall();
    }

    public static void main(String[] args) {
        dialog d = new dialogHandle();
        client(d);
    }
}
