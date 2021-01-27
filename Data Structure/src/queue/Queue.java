package DataStructure;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Queue {

    private int front, rear, size;
    private int capacity;
    private int arr[];

    public Queue(int cap) {
        capacity = cap;
        front = size = 0;
        rear = capacity - 1;
        arr = new int[this.capacity];
    }

    boolean isFull() {
        return (size == capacity);
    }

    boolean isEmpty() {
        return (size < 0);
    }

    void enqueue(int item) {
        if (isFull()) { return; } // if is full exit the method
        //
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size += 1;

        System.out.println("Enqueueing:" + item);
    }

    int dequeue() {
        if (isEmpty()) {return Integer.MIN_VALUE;}
        int item = arr[front];
        front = (front + 1) % capacity;
        size -= 1;

        return  item;
    }

    int getFront() {
        if (isEmpty()) { return Integer.MIN_VALUE; }
        return arr[front];
    }

    int getRear() {
        if (isEmpty()) { return  Integer.MIN_VALUE; }
        return arr[rear];
    }

    public static void main(String[] args) {
	// write your code here
        Queue queue = new Queue(1000);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.println("dequeue element of " + queue.dequeue());

        System.out.println("front is: " + queue.getFront());
        System.out.println("rear is: " + queue.getRear());

    }
}
