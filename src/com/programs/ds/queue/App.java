package com.programs.ds.queue;

public class App {

	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		myQueue.insert(100);
		myQueue.insert(1000);
		myQueue.insert(600);
		myQueue.insert(1);
		myQueue.insert(6);
		myQueue.insert(34 );
		myQueue.view();
	}
}
  