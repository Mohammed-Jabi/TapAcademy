package com.Tap.programs.arrays;

import java.util.Scanner;

public class LargestEleArray {

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
		int larger=a[0];
		for(int i=0; i<a.length; i++)  {
			if(a[i]>larger) {
				larger=a[i];
			}
		}
		System.out.println(larger);
	}

}
