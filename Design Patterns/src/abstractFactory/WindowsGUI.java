package designPatterns;

import designPatterns.*;

public class WindowsGUI implements GUIFactory {
    @Override
    public Button CreateButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox CreateCheckBox() {
        return new WindowsCheckBox();
    }
}
