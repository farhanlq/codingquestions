package com.programs.ds.stack;

class StackBag {

	private int maxSize;
	private int[] stackArray;
	private int top;

	public StackBag(int size) {
		this.maxSize = size;
		this.stackArray = new int[maxSize];
		this.top = -1;

	}

	public void push(int i) {
		if (isFull()) {
			System.out.println("This stack is already full!!");
		} else {
			top++;
			stackArray[top] = i;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is already empty, You can't pop");
			return '0';
		} else {
			int old_top = top;
			top--;
			return stackArray[old_top];
		}
	}

	public int peak() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (maxSize - 1 == top);
	}
}

public class BagOfNumbers {

	public static void main(String[] args) {
		StackBag theStack = new StackBag(4);

		theStack.push(12);
		theStack.push(34);
		theStack.push(89);
		theStack.push(23);

		StackBag orgStack = new StackBag(4);
		while (!theStack.isEmpty()) {
			orgStack.push(theStack.pop());
		}

		while (!orgStack.isEmpty()) {
			System.out.print(orgStack.pop()+" ");
			
		}
	}
}
