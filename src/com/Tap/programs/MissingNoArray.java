package com.Tap.programs;

import java.util.Scanner;

public class MissingNoArray {
	
	public static void main(String []args) {

		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		missingNo(n);

	}

	static void missingNo(int n) {
		
		Scanner scan = new Scanner(System.in);
		int[] array = new int[n];
		for(int i=0; i<array.length; i++) {
			array[i]=scan.nextInt();
		}
		int sum =0 ; 
		int ssum =0 ;
		
		sum = ((n+1)*((n+1)+1))/2;
		
		for(int i=0; i<array.length; i++) {
			ssum=ssum+array[i];
		}
		System.out.println(sum-ssum);
	}
}