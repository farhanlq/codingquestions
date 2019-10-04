package com.programs.ds.singlylinkedlist;

public class SinglyLinkedList {

	private Node first;

	public SinglyLinkedList() {
	}

	public boolean isEmpty() {
		return (first == null);
	}

	// insert at first position
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}

	// delete from first position
	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}

	// display list
	public void displayList() {
		System.out.println("List (first --> last)");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}

	// insert at last position
	public void insertLast(int data) {
		Node current = first;
		while (current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}

	// delete from last position
	public Node deleteLast() {
		Node current = first;
		Node temp = first.next;
		while (temp.next != null) {
			temp = temp.next;
			current = current.next;
		}
		current.next = temp.next;
		return temp;
	}

	// insert at the given position
	public void insertAtPosition(int data, int pos) {
		Node current = first;
		for (int i = 1; i < pos - 1; i++) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = current.next;
		current.next = newNode;

	}

	// delete from the given position
	public Node deleteAtPosition(int pos) {
		Node current = first;
		Node temp = first.next;
		for (int i = 1; i < pos - 1; i++) {
			temp = temp.next;
			current = current.next;
		}
		current.next = temp.next;
		return temp;

	}
}
