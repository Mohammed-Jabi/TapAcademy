package com.Tap.programs.arrays.sorted;

import java.util.Scanner;

public class RepNoIn2Array {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n=scan.nextInt();
		int m=scan.nextInt();

		int[] a = new int[n];
		int[] b = new int[m];

		for(int i=0; i<n; i++) {
			a[i]=scan.nextInt();
		}

		for(int i=0; i<m; i++) {
			b[i]=scan.nextInt();
		}

		commonNo(a,b);

	}

	static void commonNo(int[] a, int[] b) {
		int i=0,j=0;
		while(i<a.length && j<b.length) {
			if(a[i] == b[j]) {
				System.out.println(a[i]);
				i++;
				j++;
			}
			else if(b[j]<a[i]) {
				j++;
			}
			else {
				i++;
			}
		} 

	}

}
