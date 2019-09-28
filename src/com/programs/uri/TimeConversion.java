package com.programs.uri;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int seconds = scn.nextInt();
		int hour = seconds / 3600;
		int month = seconds / 60;
		int second = seconds % 60;
		System.out.println(hour + ":" + month + ":" + second);
	}
}
