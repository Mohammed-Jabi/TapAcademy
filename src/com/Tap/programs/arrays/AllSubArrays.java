package com.Tap.programs.arrays;

import java.util.Scanner;

public class AllSubArrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a= new int[n];
		for(int i=0; i<n; i++) {
			a[i]=scan.nextInt();
		}


		printSubArray(a,n);

	}

	static void printSubArray(int[] a, int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<=a.length-i; j++) {
				for(int k=j; k<j+i; k++) {
					System.out.print(a[k]+" ");
					
				}
				System.out.println();
			}
		}
	}

}
