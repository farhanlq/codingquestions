package com.programs.strings;

import java.util.Scanner;

/**
 * @author farhan.laeeq
 *
 */
public class PalindromeString {
	public static void main(String[] args) {

		System.out.println("Enter the String");
		Scanner scn = new Scanner(System.in);
		String text = scn.nextLine();
		String rev = "";
		for (int i = 0; i < text.length(); i++)
			rev += text.charAt(i);

		if (text.equals(rev)) {
			System.out.println(text + " is a palindrome String");
		} else {
			System.out.println(text + " is not a Palindrome String");
		}
		scn.close();
	}

}
