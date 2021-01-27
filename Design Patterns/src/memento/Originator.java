package memento;

public class Originator {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Memento SaveStateToMemento() {
		return new Memento(state);
	}
	
	public void getStateFromMemento(Memento mementoo) {
		state = mementoo.getState();
	}
}
