package linkedList;

public class Main {
	Node head;
	
	static class Node {
		public int data ;
		public Node next;
		
		Node(int d) {
			data = d;
		}
	}
	
	void printData() {
		
		while(head != null) {
			System.out.println(head.data);
			
			head = head.next; 
		}
	}
	
	public static void main(String [] args) {
		
		Main m = new Main();
		m.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		m.head.next = second;
		second.next = third;
		third.next = null;
		
		m.printData();
		
	}

}
