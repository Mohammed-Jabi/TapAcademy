package com.Tap.programs.arrays;

import java.util.Scanner;

public class ArraysInEven {
	
	static void array() {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar[]= new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		for(int i=0; i<ar.length; i=i+2) {
			System.out.print(ar[i]+" ");
		}
		
	}	
	public static void main(String[] args) {

		
		array();

	}

}

