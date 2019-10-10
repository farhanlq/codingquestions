package com.algo.insertionsort;

public class InsertionSort {

	public static void main(String[] args) {
		int[] A = { 34, 89, 12, 90, 1 };
		int[] sortedArray = insertionSort(A);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
	}

	private static int[] insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int element = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > element) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = element;
		}
		return a;
	}
}
