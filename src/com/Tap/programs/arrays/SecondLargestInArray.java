package com.Tap.programs.arrays;

import java.util.Scanner;

public class SecondLargestInArray {

	public static void main(String []args) {

		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		secondLargest(n);

	}

	static void secondLargest(int n) {
		
		Scanner scan = new Scanner(System.in);
		int[] array = new int[n];
		for(int i=0; i<array.length; i++) {
			array[i]=scan.nextInt();
		}
		int max = Integer.MIN_VALUE; 
		int smax = Integer.MIN_VALUE;
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				smax=max;
				max=array[i];
			}
			else if(array[i]>smax) {
				smax=array[i];
			}
		}
		System.out.println(smax);
	}
}