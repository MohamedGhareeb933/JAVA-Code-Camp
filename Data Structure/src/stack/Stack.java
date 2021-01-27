package stack;

public class Stack {
	final int MAX = 100;
	int top;
	int arr[] = new int[MAX];
	
	Stack() {
		top = -1;
	}
	
	public void push(int a) {
		if(top == (MAX - 1)) {
			System.out.println("stack is over flow");
		} else { 
			arr[++top] = a;
			System.out.println("Element is Pushed into the Stack: " + a);
		}
	}
	
	public int pop() {
		int x;
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			x = 0;
		} else {
			x = arr[top--];
		}
		return x;
	}
	
	public int peek() {
		int x;
		if(isEmpty()) {
			System.out.println("Cant peek");
			x = 0;
		} else {
			x = arr[top];
		}
		return x;
	}
	
	public boolean isEmpty() {
		return (top < 0);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(50);
		
		System.out.println("element is poped " + stack.pop());
		System.out.println("element is peeked" + stack.peek());

	}

}
