package com.programs.hackerearth;

import java.util.HashMap;
import java.util.Scanner;

public class CharSum {

	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<>();
		char c = 'a';
		for (int i = 1; i <= 26; i++, c++) {
			map.put(c, i);
		}

		map.forEach((k, v) -> System.out.println(k + " " + v));

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count = count + map.get(str.charAt(i));
		}

		System.out.println(count);

		scn.close();
	}
}
