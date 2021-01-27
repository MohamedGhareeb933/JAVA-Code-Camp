package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		taxCalculator calculator = getCalculator();
		calculator.calculateTax();

	}

	public static taxCalculator getCalculator() {
		return new taxCalculator2020();
	}
}
