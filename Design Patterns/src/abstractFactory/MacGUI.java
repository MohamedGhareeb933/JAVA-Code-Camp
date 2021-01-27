package designPatterns;

public class MacGUI implements GUIFactory {
    @Override
    public Button CreateButton() {
        return new MacButton();
    }

    @Override
    public CheckBox CreateCheckBox() {
        return new MacCheckBox();
    }
}
