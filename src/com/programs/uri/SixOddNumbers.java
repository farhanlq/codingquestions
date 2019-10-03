package com.programs.uri;

import java.util.Scanner;

public class SixOddNumbers {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		if(num%2==0) {
			num +=1;
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(num);
			num+=2;
		}
	}
}
