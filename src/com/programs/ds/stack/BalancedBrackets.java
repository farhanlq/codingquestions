package com.programs.ds.stack;

public class BalancedBrackets {

	public static String check(String str) {
		int stackSize = str.length();
		Stack stack = new Stack(stackSize);
		for (int i = 0; i < stackSize; i++) {

			char current = str.charAt(i);
			if (current == '{' || current == '(' || current == '[') {
				stack.push(current);
			}
			if (current == '}' || current == ')' || current == ']') {
				if (stack.isEmpty())
					return "NO";
				char last = stack.peak();
				if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
					stack.pop();
				else
					return "NO";
			}
		}
		if (stack.isEmpty())
			return "YES";
		else
			return "NO";
	}

	public static void main(String[] args) {
		System.out.println(check("{[()]}"));
		System.out.println(check("{[(])}"));
		System.out.println(check("{{[[(())]]}}"));
	}
}
