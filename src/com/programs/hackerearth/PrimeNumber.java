package com.programs.hackerearth;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int limit = scn.nextInt();
		for (int i = 2; i <= limit; i++) {
			if (isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		scn.close();
	}

	private static boolean isPrime(int i) {
		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}
}
