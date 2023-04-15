package com.Tap.programs.arrays;

import java.util.Scanner;

public class LongestIncSubArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a= new int[n];
		for(int i=0; i<n; i++) {
			a[i]=scan.nextInt();
		}

		longestSubArray(a);

	}

	static void longestSubArray(int[] a) {

		int si=0, ei=0, start=0, end=0;
		for(int i=0; i<a.length-1; i++) {
			if(a[i]==a[i+1]-1) {
				ei++;
			}
			else {
				if(ei-si > end-start) {
					start=si;
					end=ei;
					for(int j=start; j<=end; j++) {
						System.out.print(a[j]+ " ");
					}
					ei=i+1;
					si=i+1;
				}
				
			}
		}
		
		if(ei-si > end-start) {
			start=si;
			end=ei;
			for(int j=start; j<=end; j++) {
				System.out.println(a[j]+ " ");
			}
		}

	}//Error in program

}

