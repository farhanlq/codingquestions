package com.programs.hackerearth;

import java.util.Scanner;

public class EvenSquare {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		long square;
		for (int i = 2; i <= num; i+=2) {
			square = (long) Math.pow(i, 2);
			System.out.println(i+"^2 = "  +square);
		}
	}
}
