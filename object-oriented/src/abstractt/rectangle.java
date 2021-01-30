package abstractt;

public class rectangle extends shape {
   
    public rectangle(int x, int y) {
        super(x, y);
    }

    @Override
    public int multiply() {
        return this.x * this.y;
    }
    
    public String getInfo() {
        return super.getInfo();
    }
    
}
