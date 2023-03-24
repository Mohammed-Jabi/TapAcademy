package com.Tap.programs;

import java.util.Scanner;

public class SumOfP_NNo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] array = new int[n];
		for(int i=0; i<array.length; i++) {
			array[i]=scan.nextInt();
		}
		int sum=0;int sum1=0;
		for(int i=0; i<array.length; i++) {
			if(array[i]>=0) {
				sum=sum+array[i];
			}
			else {
				sum1=sum1+array[i];
			}
		}
		System.out.println(sum);
		System.out.println(sum1);
	}

}


