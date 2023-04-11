package com.Tap.programs.arrays;

import java.util.Scanner;

public class SubArraySumKCountArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a= new int[n];
		for(int i=0; i<n; i++) {
			a[i]=scan.nextInt();
		}
		int siz=scan.nextInt();
		int k = scan.nextInt();

		subArraySumKCount(a,n,siz,k);

	}

	static void subArraySumKCount(int[] a, int n, int siz, int k) {
		int count=0;
		for(int i=0; i<=a.length-siz; i++) {
			int sum = 0;
			
			for(int j=i; j<i+siz; j++) {
				sum = sum+a[j];
			}
			if(sum==k) {
				count++;
			}

		}
		System.out.println(count);
	}

}
