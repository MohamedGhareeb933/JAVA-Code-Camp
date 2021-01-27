package designPatterns;

public class Main {

    public static Application CreateApplication() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")){
            factory = new MacGUI();
            app = new Application(factory);
        }
        else {
            factory = new WindowsGUI();
            app = new Application(factory);
        }

        return app;
    }

    public static void main(String [] args){
        Application App = CreateApplication();
        App.paint();
    }
}
