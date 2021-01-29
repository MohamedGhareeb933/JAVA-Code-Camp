package superclass;

public class animal {

    private String name;
    private String noise;
    
    animal(String name, String noise) {
        this.name = name;
        this.noise = noise;
    }

    public void context() {
        System.out.println(name + ": is making a noise <<<<<<< " + noise);
    }
}
