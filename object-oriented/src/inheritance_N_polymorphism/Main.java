package inheritance_N_polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawUIControl(new checkBox());
	}

	public static void drawUIControl(UIControl control) {
		control.draw();
	}
}
