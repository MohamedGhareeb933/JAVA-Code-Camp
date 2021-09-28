package designpatterns;


public class main {

    static void Client(designpatterns.Abstraction abs) {
        System.out.println(abs.operation());
    }

    void CallA() {
        Implement imp = new ConcImplementsA();
        Abstraction Abs = new Abstraction(imp);
        Client(Abs);
    }

    void CallB() {
        Implement imp2 = new ConcImplementsB();
        Abstraction Abs2 = new AbstractAddition(imp2);
        Client(Abs2);
    }
    
    public static void main(String [] args) {
        main m = new main();
        m.CallB();
        m.CallA();
    }
}
