package com.programs.uri;

import java.util.Scanner;

public class Combiner {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String first = scn.nextLine();
		String second = scn.nextLine();
		String result = "";
		for (int i = 0; i < (first.length() + second.length()); i++) {
			if (i % 2 == 0) {
				result = result + first.charAt(i);
			} else {
				result = result + second.charAt(i);
			}
		}
	}
}
