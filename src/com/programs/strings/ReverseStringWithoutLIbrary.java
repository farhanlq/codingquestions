package com.programs.strings;

import java.util.Scanner;

public class ReverseStringWithoutLIbrary {

	public static void main(String[] args) {

		System.out.println("Enter the String ");
		Scanner scn = new Scanner(System.in);
		String text = scn.nextLine();
		char[] originalString = text.toCharArray();
		String result = reverseString(originalString);
		System.out.println("The reverse of the string " + text + " is " + result);
		scn.close();
	}

	private static String reverseString(char[] originalString) {
		for (int i = 0; i < originalString.length / 2; i++) {
			char temp = originalString[i];
			originalString[i] = originalString[originalString.length - 1 - i];
			originalString[originalString.length - 1 - i] = temp;

		}
		return new String(originalString);

	}

}
