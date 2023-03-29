package com.Tap.programs.arrays;

import java.util.Scanner;

public class OddNoInArray {
	
	static void array() {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar[]= new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		for(int i=0; i<ar.length-1; i++) {
			if(ar[i]%2!=0) {
				System.out.print(ar[i]+" ");
			}
		}
		
	}	
	public static void main(String[] args) {

		
		array();

	}

}

