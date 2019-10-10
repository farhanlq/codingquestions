package com.programs.ds.doublelinkedlist;

public class DoubleLinkedList {

	private Node first;

	public void insertLast(int data) {
		Node current = first;
		while (current.next != null) {
			current = current.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
		newNode.prev = current;

	} 

}
