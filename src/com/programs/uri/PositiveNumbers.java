package com.programs.uri;

import java.util.Scanner;

public class PositiveNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double[] array = new double[6];
		int count = 0;
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextDouble();
			if (array[i] > 0.0) {
				count++;
				sum +=array[i];
			}
		}
		System.out.println(count+ " valores positivos");
		System.out.println(sum/count);

	}
}
