package com.programs.ds.stack;

public class BalancedBrackets {

	public static String check(String str) {
		int stackSize = str.length();
		Stack stack = new Stack(stackSize);
		for (int i = 0; i < stackSize; i++) {
			if (str.charAt(i) == '{' || str.charAt(i) == '(' || str.charAt(i) == '[') {
				stack.push(str.charAt(i));
			}
			if (str.charAt(i) == '}' || str.charAt(i) == ')' || str.charAt(i) == ']') {
				stack.pop();
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
