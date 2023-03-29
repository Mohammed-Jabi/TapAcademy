package com.Tap.programs.arrays;

import java.util.Scanner;

public class SmallestMaxOccNo {
	
	static void array() {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar[]= new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		for(int i=ar.length-1; i>0; i--) {
			if(ar[i]==ar[i-1]) {
				System.out.print(ar[i]+" ");
				break;
			}
		}
		
	}	
	public static void main(String[] args) {

		
		array();

	}

}

