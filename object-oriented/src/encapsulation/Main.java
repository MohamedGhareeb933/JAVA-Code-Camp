package encapsulation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		account.deposite(10);
		account.withdraw(5);
		
		account.returnBalance();
	}

}
