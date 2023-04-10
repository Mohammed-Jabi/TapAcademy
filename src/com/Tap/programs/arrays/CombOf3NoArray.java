package com.Tap.programs.arrays;

import java.util.Scanner;

public class CombOf3NoArray {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a= new int[n];
		for(int i=0; i<n; i++) {
			a[i]=scan.nextInt();
		}
		
		combOfThreeNo(a,n);

	}

	static void combOfThreeNo(int[] a, int n) {
		
		for(int i=0; i<a.length-2; i++) {
			for(int j=i; j<i+3; j++) {
				System.out.print(a[j]+ " ");
			}
			System.out.println();
		}
		
	}

}
