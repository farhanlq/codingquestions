package com.programs.uri;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] array = new int[N];
		String result = "";
		for (int i = 0; i < N; i++) {
			array[i] = scn.nextInt();
			if (array[i] > 0) {
				result = array[i] % 2 == 0 ? "EVEN POSITIVE" : "ODD POSITIVE";
			}
			if (array[i] < 0) {
				result = array[i] % 2 == 0 ? "EVEN NEGATIVE" : "ODD NEGATIVE";
			}
			if (array[i] == 0) {
				result = "NULL";
			}
			System.out.println(result);
		}

	}
}
