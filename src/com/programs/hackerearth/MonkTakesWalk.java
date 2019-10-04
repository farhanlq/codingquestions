package com.programs.hackerearth;

import java.util.Scanner;

public class MonkTakesWalk {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		scn.nextLine();
		for (int j = 0; j < tc; j++) {
			String text = scn.nextLine();
			int count = 0;
			for (int i = 0; i < text.length(); i++) {
				if (text.charAt(i) == 'a' || text.charAt(i) == 'A' || text.charAt(i) == 'e' || text.charAt(i) == 'E'
						|| text.charAt(i) == 'i' || text.charAt(i) == 'I' || text.charAt(i) == 'o'
						|| text.charAt(i) == 'O' || text.charAt(i) == 'u' || text.charAt(i) == 'U') {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
