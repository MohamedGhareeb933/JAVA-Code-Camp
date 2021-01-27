package classes;

public class User {

	public String Name;
	
	public User(String Name) {
		// set the User Name of the current object to the Name in Constructor Paramter.
		// this is a refrence to User object.
		this.Name = Name;
	}
	
	public void sayHello () {
		System.out.println("hello, my name is: " + Name);
	}
}
