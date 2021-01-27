package memento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState("h"); // set state 
		careTaker.push(originator.SaveStateToMemento()); // push memento instance that has the state input into arraylist

		originator.getStateFromMemento(careTaker.pop()); // set the state in orignator to state in the arraylist
		System.out.println("Top index is: " +  originator.getState());
		

		
	}

}
