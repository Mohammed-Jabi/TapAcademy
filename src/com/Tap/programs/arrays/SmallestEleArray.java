package com.Tap.programs.arrays;

import java.util.Scanner;

public class SmallestEleArray {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		smallestNo(n);

	}

	static void smallestNo(int n) {

		Scanner scan = new Scanner(System.in);
		int a[] = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt(); 
		}
		int smal=a[0];
		for(int i=0; i<a.length; i++)  {
			if(a[i]<smal) {
				smal=a[i];
			}
		}
		System.out.println(smal);
	}

}
