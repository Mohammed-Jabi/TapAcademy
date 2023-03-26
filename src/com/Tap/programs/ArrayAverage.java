package com.Tap.programs;

import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] array = new int[n];
		for(int i=0; i<array.length; i++) {
			array[i]=scan.nextInt();
		}
		float sum=0;
		for(int i=0; i<array.length; i++) {
			sum=sum+array[i];
		}
		float res=sum%n;
		System.out.println(sum);


	}

}
