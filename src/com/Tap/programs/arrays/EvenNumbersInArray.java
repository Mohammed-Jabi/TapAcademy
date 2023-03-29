package com.Tap.programs.arrays;

import java.util.Scanner;

public class EvenNumbersInArray {

	public static void main(String[] args) {
		
		array();
	}

	private static void array() {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] array = new int[n];
		for(int i=0; i<array.length; i++) {
			array[i]=scan.nextInt();
		}
		for(int i=0; i<=array.length; i++) {
			if(array[i]%2==0) {
				System.out.print(array[i]+" ");
			}		
		}
		
	}

}
