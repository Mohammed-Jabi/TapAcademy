package com.Tap.programs.arrays;

import java.util.Scanner;

public class MaxSumOf2NoArray {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		largestNo(n);

	}

	static void largestNo(int n) {

		Scanner scan = new Scanner(System.in);
		int a[] = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt(); 
		}
		int larger=a[0],smax=Integer.MIN_VALUE;
		int smallest = a[0],sSmal=Integer.MAX_VALUE;
//		for(int i=0; i<a.length; i++)  {
//			if(a[i]>larger) {
//				larger=a[i];
//			}
//		}
		for(int i=0; i<a.length; i++) {
			if(a[i]>larger) {
				smax=larger;
				larger=a[i];
			}
			else if(a[i]>smax) {
				smax=a[i];
			}
		}
		int res1 = larger +  smax;
//		for(int i=0; i<a.length; i++)  {
//			if(a[i]<smallest) {
//				smallest=a[i];
//			}
//		}
		for(int i=0; i<a.length; i++) {
			if(a[i]<sSmal) {
				sSmal=smallest;
				smallest=a[i];
			}
			else if(a[i]>sSmal) {
				sSmal=a[i];
			}
		}
		int res2 = smallest + sSmal;
		if(res1>res2) {
			System.out.println(res1);
		}
		else {
			System.out.println(res2);
		}
	}
	

}

