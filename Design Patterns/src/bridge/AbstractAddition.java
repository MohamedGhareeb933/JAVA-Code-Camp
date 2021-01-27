package designpatterns;

public class AbstractAddition extends Abstraction {
    AbstractAddition(Implement implement) {
        super(implement);
    }

    String operation() {
        return " Abstract Addition Method is calling " + implement.doSomething();
    }
}
