package designPatterns;

public class Application {
    Button button;
    CheckBox checkbox;

    public Application(GUIFactory factory) {
            button = factory.CreateButton();
            checkbox = factory.CreateCheckBox();
    }

    public void paint() {
        System.out.println(button.Paint());
        System.out.println(checkbox.Paint());

    }
}
