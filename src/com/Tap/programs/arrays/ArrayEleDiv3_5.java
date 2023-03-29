package com.Tap.programs.arrays;

import java.util.Scanner;

public class ArrayEleDiv3_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] array = new int[n];
		for(int i=0; i<array.length; i++) {
			array[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0; i<array.length; i++) {
			if(array[i]%3==0 || array[i]%5==0) {
				System.out.println(array[i]+" ");
			}		
		}
		
	}

}

