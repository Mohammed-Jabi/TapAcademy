package com.Tap.programs.arrays;

import java.util.Scanner;

public class SumOfESArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] array = new int[n];
		for(int i=0; i<array.length; i++) {
			array[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0; i<array.length; i++) {
			if(array[i]%2==0) {
				sum=sum+array[i];
			}		
		}
		System.out.println(sum);
	}

}
