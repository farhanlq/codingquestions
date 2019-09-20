package com.programs.uri;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		Scanner scn = new Scanner(System.in);
		int month = scn.nextInt();
		System.out.println(months[month - 1]);
	}
}
