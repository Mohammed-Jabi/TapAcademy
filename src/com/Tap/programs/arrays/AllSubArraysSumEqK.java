package com.Tap.programs.arrays;

import java.util.Scanner;

public class AllSubArraysSumEqK {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a= new int[n];
		for(int i=0; i<n; i++) {
			a[i]=scan.nextInt();
		}
		int s=scan.nextInt();

		printSubArrayEqK(a,n,s);

	}

	static void printSubArrayEqK(int[] a, int n,int s) {

		for(int i=1; i<=n; i++) {
			for(int j=0; j<=a.length-i; j++) {
				int sum=0;
				for(int k=j; k<j+i; k++) {
					sum=sum+a[k];
				}
				if(sum==s) {
					System.out.println(sum );
				}

			}
		}
	}


}
