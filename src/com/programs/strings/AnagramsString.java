package com.programs.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AnagramsString {

	public static void main(String[] args) {
		System.out.println("Enter the first String ");
		Scanner scn = new Scanner(System.in);
		String firstString = scn.nextLine();
		System.out.println("Enter the second String ");
		String secondString = scn.nextLine();
		firstString = firstString.replaceAll("\\s+", "");
		secondString = secondString.replaceAll("\\s+", "");

		System.out.println(firstString + " " + secondString); 

		if (checkAnagrams(firstString, secondString)) {
			System.out.println("Strings are Anagrams ");
		} else {
			System.out.println("Strings are not Anagrams ");
		}
		scn.close();
	}

	private static boolean checkAnagrams(String firstString, String secondString) {
		if (firstString.length() != secondString.length()) {
			return false;
		} else {
			Collections.sort(Arrays.asList(firstString));
			Collections.sort(Arrays.asList(secondString));
			if (firstString.equals(secondString)) {
				return true;
			}
			return false;
		}
	}
}
