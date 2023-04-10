package com.Tap.programs.arrays;

import java.util.Scanner;

public class SumSizeEqualsArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a= new int[n];
		for(int i=0; i<n; i++) {
			a[i]=scan.nextInt();
		}
		int val=scan.nextInt();
		int s=scan.nextInt();
		sumSizeEquals(a,n,val,s);

	}

	static void sumSizeEquals(int[] a, int n, int val,int s) {
		
		for(int i=0; i<=a.length-val; i++) {
			int sum=0;
			for(int j=i; j<i+val; j++) {
				sum = sum+a[j];
			}
			if(sum==s) {
				System.out.print(s);
			}
			
			System.out.println();
		}
		
	}

}

