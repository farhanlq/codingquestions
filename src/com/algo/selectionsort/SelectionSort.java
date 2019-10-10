package com.algo.selectionsort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] A = { 34, 89, 12, 90, 1 };
		int[] sortedArray = selectionSort(A);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
	}

	private static int[] selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int minimum = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[minimum]) {
					minimum = j;
				}
			}
			int temp = a[i];
			a[i] = a[minimum];
			a[minimum] = temp;
		}
		return a;
	}
}
