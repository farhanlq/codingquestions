package com.programs.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Divisible {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_A = br.readLine().split(" ");
         int[] A = new int[N];
         for(int i_A=0; i_A<arr_A.length; i_A++)
         {
         	A[i_A] = Integer.parseInt(arr_A[i_A]);
         }

         String out_ = solve(A);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static String solve(int[] A){
    int[] firstArray = new int[A.length/ 2];
		int[] secondArray = new int[A.length / 2];

		String number = "";

		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = A[i];
			number = number + String.valueOf(firstArray[i]).charAt(0);
		}

		for (int i = secondArray.length-1; i >=0; i--) {
			secondArray[i] = A[A.length - 1 - i];
			number = number + (secondArray[i] % 10);
		}
		 
		  
		 return (Integer.parseInt(number)%11 == 0) ? "OUI" : "NON";
    
    }
}
