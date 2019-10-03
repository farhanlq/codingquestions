package com.programs.uri;

import java.util.Scanner;

public class EvenOddPositvieNegative {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] array = new int[5];
		int evenCount = 0;
		int oddCount = 0;
		int positiveCount = 0;
		int negativeCount = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextInt();
			if (array[i] % 2 == 0) {
				evenCount++;
			}
			if (array[i] % 2 != 0) {
				oddCount++;
			}
			if (array[i] > 0) {
				positiveCount++;
			}
			if (array[i] < 0) {
				negativeCount++;
			}

		}
		System.out.println(evenCount + " valor(es) par(es)");
		System.out.println(oddCount + " valor(es) impar(es)");
		System.out.println(positiveCount + " valor(es) positivo(s)");
		System.out.println(negativeCount + " valor(es) negativo(s)");

	}
}
