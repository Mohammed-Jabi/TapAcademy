package com.Tap.programs;

import java.util.Scanner;

public class SumOfNNaturalNo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		sumOfNumbers(n);

	}

	 static void sumOfNumbers(int n) {
		
		 int count=0;
		 for(int i=1; i<=n; i++)
		 {
			 count=count+i;
		 }
		System.out.println(count);
	}

}
