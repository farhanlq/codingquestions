package com.programs.hackerrank;

import java.util.Scanner;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		System.out.println("Enter value for n and k");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		System.out.println("Enter the elements ");
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = scn.nextInt();
		}
		int pairs = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n ; j++) {
				if ((ar[i] + ar[j]) % k == 0) {
					pairs++;
				} else {

				}
			}
		}
		System.out.println(pairs);
	}
}
