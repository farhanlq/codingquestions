package com.programs.uri;

import java.util.Scanner;

public class EvenBWFiveNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] array = new int[5];
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextInt();
			if (array[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println(count + " valores pares");

	}
}
