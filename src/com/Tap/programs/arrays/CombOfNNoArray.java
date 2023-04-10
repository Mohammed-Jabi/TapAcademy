package com.Tap.programs.arrays;

import java.util.Scanner;

public class CombOfNNoArray {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a= new int[n];
		for(int i=0; i<n; i++) {
			a[i]=scan.nextInt();
		}
		int val=scan.nextInt();
		
		combOfNNo(a,n,val);

	}

	static void combOfNNo(int[] a, int n, int val) {
		
		for(int i=0; i<=a.length-val; i++) {
			for(int j=i; j<i+val; j++) {
				System.out.print(a[j]+ " ");
			}
			System.out.println();
		}
		
	}

}
