package com.programs.ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList myList = new SinglyLinkedList();
		myList.insertFirst(100);
		myList.insertFirst(200);
		myList.insertFirst(500);
		myList.insertFirst(800);
		myList.insertLast(901);
		// myList.deleteLast();
		// myList.deleteFirst();
		myList.insertAtPosition(34, 3);
		myList.deleteAtPosition(4);
		myList.displayList();

	}
}
