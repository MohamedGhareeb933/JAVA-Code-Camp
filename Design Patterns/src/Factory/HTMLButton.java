package PackageTest;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("<BUTTON> CLICK </BUTTON>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("NEW HTML BUTTON HAS BEEN OPENED");
    }
}
