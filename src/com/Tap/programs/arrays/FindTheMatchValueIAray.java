package com.Tap.programs.arrays;

import java.util.Scanner;

public class FindTheMatchValueIAray {
	
	public static void main (String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int[] a = new int[n];
	for(int i=0; i<n; i++) {
		a[i] = scan.nextInt();
	}
	
	matchValueInd(a);
		
	}

	static void matchValueInd(int[] a) {
		
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();

		for(int i=0; i<a.length; i++) {
			if(k == a[i]) {
				System.out.println(i);
				break;
			}
			else {
				System.out.println("-1");
				break;
			}
		}
		
	}

}
