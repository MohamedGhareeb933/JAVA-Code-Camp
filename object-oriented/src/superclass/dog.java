package superclass;

public class dog extends animal {

    private String name;
    private String noise;
    private String order;

    dog(String name, String noise, String order) {
        super(name , noise);
        this.order = order;
    }

    public void context() {
        super.context();
        System.out.println(order);
    }
}
