package com.algo.binarysearch;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements in the array ");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		System.out.println("Enter the Elements");
		int A[] = new int[num];
		for (int i = 0; i < A.length; i++) {
			A[i] = scn.nextInt();
		}
		System.out.println("Enter the element to be searched ");
		int x = scn.nextInt();
		int res = binarySearch(A, x);
		if (res == -1) {
			System.out.println(x + " is not present in the given array ");
		} else {
			System.out.println(x + " is present at the location " + (res + 1));
		}
	}

	private static int binarySearch(int[] a, int x) {
		int p = 0, r = a.length - 1;
		while (p <= r) {
			int q = (p + r) / 2;
			if (a[q] == x) {
				return q;
			} else if (a[q] > x) {
				r = q - 1;
			} else {
				p = q + 1;
			}
		}
		return -1;
	}
}
