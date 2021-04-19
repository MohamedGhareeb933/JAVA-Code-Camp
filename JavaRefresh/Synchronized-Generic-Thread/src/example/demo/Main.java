package example.demo;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static class Sender {
		
		// Generic Method with synchronized - 
		// means that passed argument could be of any type
		// and synchronized that only one thread will be run at a time
		public synchronized <T> void Message(T msg) {
			// synchronized(this){
			System.out.println("Sending: " + msg);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("Thread Intrupted");
			}
			System.out.println("sent: " + msg);
		}
	}
	
	// generic class that implements Runnable to use threads that runs parallel with main thread
	public static class ThreadedSender<T> implements Runnable {
		
		T msg;
		Sender sender;
		
		public ThreadedSender(T msg, Sender sender) {
			this.msg = msg;
			this.sender = sender;
		}
		
		// override the run method of java thread
		public void run() {
			// synchronized(sender){
			sender.Message(msg);		
		}
	} 
	
	public static void main(String [] args) {
		Sender sender = new Sender();
		// Initialize Thread and pass Runnable derived class 
		Thread t1 = new Thread( new ThreadedSender<>(1, sender) );
		Thread t2 = new Thread( new ThreadedSender<>("Hello", sender) );
		
		// we can go more far than that but its not recommended
		List<String> list = new ArrayList<>();
		list.add("mohamed");
		list.add("ahmed");

		Thread t3 = new Thread( new ThreadedSender<>(list, sender) );
		
		// start the thread 
		t1.start();
		t2.start();
		t3.start();
		
		try {
			// waits for the thread to die - if the thread is interrupted an exception will be thrown
			t1.join();
			t2.join();
			t3.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
