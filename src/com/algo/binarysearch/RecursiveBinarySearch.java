package com.algo.binarysearch;

import java.util.Scanner;

public class RecursiveBinarySearch {

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
		int p = 0, r = A.length - 1;
		int res = binarySearch(A, p, r, x);
		if (res == -1) {
			System.out.println(x + " is not present in the given array ");
		} else {
			System.out.println(x + " is present at the location " + (res + 1));
		}
	}

	private static int binarySearch(int[] a, int p, int r, int x) {

		if (p > r) {
			return -1;
		}

		else {
			int q = (p + r) / 2;
			if (a[q] == x) {
				return q;
			} else if (a[q] > x) {
				return binarySearch(a, p, q - 1, x);
			} else {
				return binarySearch(a, q + 1, r, x);
			}
		}
	}

}
