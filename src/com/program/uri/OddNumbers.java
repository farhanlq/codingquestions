package com.program.uri;

import java.util.Scanner;

public class OddNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		for (int i = 0; i < num; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		scn.close();
	}
}
