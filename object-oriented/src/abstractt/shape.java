package abstractt;

public abstract class shape {
    protected int x;
    protected int y;

    public shape(int x, int y) {
        this.x = x; 
        this.y = y;
    }

    
    public String getInfo() {
        return "x = " + x + " y = " + y;
    }

    public abstract int multiply();
}
