package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	private List<Memento> memntoList = new ArrayList<Memento>();
	private int index;
	
	//push
	public void push(Memento mementoo) {
		memntoList.add(mementoo);
		index = memntoList.size() - 1;
	}
	
	//pop
	public Memento peek() {
		return memntoList.get(index);
	}
	
	public Memento pop() {
		return memntoList.get(index--);
	}
}
