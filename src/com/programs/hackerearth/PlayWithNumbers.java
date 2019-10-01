package com.programs.hackerearth;

import java.util.Scanner;

public class PlayWithNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int Q = scn.nextInt();
		int[] QueArray = new int[N];
		for (int i = 0; i < N; i++) {
			QueArray[i] = scn.nextInt();
		}
		
		double[] mean = new double[Q];
		for (int j = 0; j < Q; j++) {
			int ele1 = scn.nextInt();
			int ele2 = scn.nextInt();

			 mean[j] = Math.floor((double) (ele1 + ele2) / 2);
			System.out.println((int)mean[j]);
		}
	}
}
