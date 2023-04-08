package com.Tap.CodeChef;

import java.util.Scanner;

public class KitchenTiming {


	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] a = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}

		int[] a1 = new int[n];
		for(int i=0; i<a1.length; i++) {
			a1[i]=scan.nextInt();
		}
		int t=scan.nextInt();
		for(int k=0; k<t; k++) {
			int count = 0;
			if(a1[0] <= a[0]) {
				count++;
			}
			for(int i=1; i<a1.length; i++) {
				if(a1[i] <= a[i]-a[i-1]) {
					count++;
				}
			}
		System.out.println(count);
		}
		
	}
}
