package com.programs.hackerearth;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] originalArray = new int[N];

		for (int i = 0; i < N; i++) {
			originalArray[i] = scn.nextInt();
		}
		int[] firstArray = new int[N / 2];
		int[] secondArray = new int[N / 2];

		String number = "";

		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = originalArray[i];
			number = number + String.valueOf(firstArray[i]).charAt(0);
		}

		for (int i = secondArray.length-1; i >=0; i--) {
			secondArray[i] = originalArray[originalArray.length - 1 - i];
			number = number + (secondArray[i] % 10);
		}
		 if(Integer.parseInt(number)%11 == 0) {
			 
		 }
		 String result = (Integer.parseInt(number)%11 == 0) ? "OUI" : "NON";
		System.out.println(result);
	}
}
