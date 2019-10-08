package com.programs.patterns;

public class Pattern1 {

	public static void main(String[] args) {
		int num =1;
		char ch = 'A';
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(num+++""+ch++);
			}
			System.out.println();
		}
	}
}
