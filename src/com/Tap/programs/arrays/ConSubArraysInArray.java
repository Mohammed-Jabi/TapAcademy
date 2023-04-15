package com.Tap.programs.arrays;

import java.util.Scanner;

public class ConSubArraysInArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a= new int[n];
		for(int i=0; i<n; i++) {
			a[i]=scan.nextInt();
		}

		sumSizeEquals(a);

	}

	static void sumSizeEquals(int[] a) {

		int si=0, ei=0;
		for(int i=0; i<a.length-1; i++) {
			if(a[i]==a[i+1]-1) {
				ei++;
			}
			else {
				if(ei-si >0) {
					for(int j=si; j<=ei; j++) {
						System.out.print(a[j]+ " ");
					}
					System.out.println();
				}
				ei=i+1;
				si=i+1;
			}
		}

		if(ei-si >0) {
			for(int j=si; j<=ei; j++) {
				System.out.print(a[j]+ " ");
			}
			System.out.println();
		}

	}

}
