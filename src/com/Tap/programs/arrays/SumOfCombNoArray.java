package com.Tap.programs.arrays;

import java.util.Scanner;

public class SumOfCombNoArray {
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a= new int[n];
		for(int i=0; i<n; i++) {
			a[i]=scan.nextInt();
		}
		int val=scan.nextInt();
		
		sumOfCombi(a,n,val);

	}

	static void sumOfCombi(int[] a, int n, int val) {
		
		for(int i=0; i<=a.length-val; i++) {
			int sum=0;
			for(int j=i; j<i+val; j++) {
				sum = sum+a[j];
			}
			System.out.print(sum);
			System.out.println();
		}
		
	}

}
