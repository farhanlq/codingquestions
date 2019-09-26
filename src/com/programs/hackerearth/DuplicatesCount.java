package com.programs.hackerearth;

public class DuplicatesCount {
	public static void main(String[] args) {
		int first[] = { 1, 2, 4, 5, 6 };
		int second[] = { 3, 4, 1, 6, };
		int count = 0;
		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < second.length; j++) {
				if (first[i] == second[j]) {
					count++;
				}
			}
		}
		System.out.println("Number of duplicates in both arrays are " + count);
	}
}
