package com.programs.ds.stack;

public class BagOfNumbers {

	public static void main(String[] args) {
		Stack theStack = new Stack(4);

		theStack.push('a');
		theStack.push('b');
		theStack.push('d');
		theStack.push('e');

		Stack orgStack = new Stack(4);
		while (!theStack.isEmpty()) {
			orgStack.push(theStack.pop());
		}

		while (!orgStack.isEmpty()) {
			System.out.print("" + orgStack.pop());
		}
	}
}
