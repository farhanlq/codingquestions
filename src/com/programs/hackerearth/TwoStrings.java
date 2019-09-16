package com.programs.hackerearth;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String string1 = scn.nextLine();
		String string2 = scn.nextLine();
		Arrays.sort(string1.toCharArray());
		Arrays.sort(string2.toCharArray());
		if (string1.length() == string2.length()) {
			if (string1.equals(string2)) {
				System.out.println("YES");
			}
		} else {
			System.out.println("NO");
		}

	}
}
