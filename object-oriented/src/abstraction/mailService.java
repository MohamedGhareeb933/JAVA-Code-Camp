package abstraction;

public class mailService {
	
	public void sendMail() {
		connect();
		authenticate();
		disconnect();
	}
	
	private void connect() {
		System.out.println("connect");
	}
	
	private void authenticate() {
		System.out.println("authenticate");
	}
	
	private void disconnect() {
		System.out.println("disconnect");
	}
  
	
}
