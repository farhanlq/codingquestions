package com.algo.mergesort;

public class MergeSort {

	public static void main(String[] args) {
		int[] A = { 34, 89, 12, 90, 1 };
		sort(A);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}

	private static void sort(int[] a) {
		sort(a, 0, a.length - 1);

	}

	private static void sort(int[] a, int start, int end) {
		if (end <= start) {
			return;
		}
		int mid = (start + end) / 2;
		sort(a, start, mid);
		sort(a, mid + 1, end);
		merge(a, start, mid, end);
	}

	private static void merge(int[] a, int start, int mid, int end) {
		int temp[] = new int[end - start + 1];
		int leftSlot = start;
		int rightSlot = mid + 1;
		int k = 0;

		while (leftSlot <= mid && rightSlot <= end) {
			if (a[leftSlot] < a[rightSlot]) {
				temp[k] = a[leftSlot];
				leftSlot += 1;
			} else {
				temp[k] = a[rightSlot];
				rightSlot += 1;
			}
			k=k+1;
		}
		if (leftSlot <= mid) {
			while (leftSlot <= mid) {
				temp[k] = a[leftSlot];
				leftSlot += 1;
				k=k+1;
			}
		} else if (rightSlot <= end) {
			while (rightSlot <= end) {
				temp[k] = a[rightSlot];
				rightSlot += 1;
				k=k+1;
			}
		}

		for (int i = 0; i <= temp.length; i++) {
			a[start + i] = temp[i];
		}
	}

}
