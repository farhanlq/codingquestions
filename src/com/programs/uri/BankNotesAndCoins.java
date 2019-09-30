package com.programs.uri;

import java.util.Scanner;

public class BankNotesAndCoins {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double number = scn.nextDouble();
		int hundred = (int) number / 100;
		number = number - hundred * 100;
		System.out.println("NOTAS:");
		System.out.println(hundred + " nota(s) de R$ 100.00");

		int fifty = (int) number / 50;
		number = number - fifty * 50;
		System.out.println(fifty + " nota(s) de R$ 50.00");

		int twenty = (int) number / 20;
		number = number - twenty * 20;
		System.out.println(twenty + " nota(s) de R$ 20.00");

		int ten = (int) number / 10;
		number = number - ten * 10;
		System.out.println(ten + " nota(s) de R$ 10.00");

		int five = (int) number / 5;
		number = number - five * 5;
		System.out.println(five + " nota(s) de R$ 5.00");

		int two = (int) number / 2;
		number = number - two * 2;
		System.out.println(two + " nota(s) de R$ 2.00");

		
		int one = (int) number / 1;
		number = number - one * 1;
		System.out.println("MOEDAS:");
		System.out.println(one + " nota(s) de R$ 1.00");

		int ffifty = (int) ((double) number / 0.50);
		number = number - ffifty * 0.50;
		System.out.println(ffifty + " nota(s) de R$ 0.50");

		int ftwentyfive = (int) ((double) number / 0.25);
		number = number - ftwentyfive * 0.25;
		System.out.println(ftwentyfive + " nota(s) de R$ 0.25");

		int ften = (int) ((double) number / 0.10);
		number = number - ften * 0.10;
		System.out.println(ften + " nota(s) de R$ 0.10");

		int ffive = (int) ((double) number / 0.05);
		number = number - ffive * 0.05;
		System.out.println(ffive + " nota(s) de R$ 0.05");

		int done = (int) ((double) number / 0.01);
		number = number - done * 0.01;
		System.out.println(done + " nota(s) de R$ 0.01");

	}
}
