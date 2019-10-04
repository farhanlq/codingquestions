package com.programs.ds.singlylinkedlist;

public class SinglyLinkedList {

	private Node first;

	public SinglyLinkedList() {
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}

	public Node deleteFirst() {
		Node temp = first;
		first = first.next;
		return temp;
	}

	public void displayList() {
		System.out.println("List (first --> last)");
		Node current = first;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
		System.out.println();
	}

	public void insertLast(int data) {
		Node current = first;
		while (current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}

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
}
