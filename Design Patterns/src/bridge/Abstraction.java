package designpatterns;

public class Abstraction {
    Implement implement;
    Abstraction(Implement implement) {
        this.implement = implement;
    }

     String operation() {
        return " Abstract Method is calling " + implement.doSomething();
    }
}
