package PackageTest;

public abstract class dialog {
    public void ButtonCall() {
        Button b = getButton();
        b.render();
    }

    public abstract Button getButton();
}
