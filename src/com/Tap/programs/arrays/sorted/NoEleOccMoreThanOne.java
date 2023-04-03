package com.Tap.programs.arrays.sorted;

import java.util.Scanner;

public class NoEleOccMoreThanOne {

static void array() {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar[]= new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		int count=1, max=0; 
		for(int i=0; i<ar.length-1; i++) {
			if(ar[i] == ar[i+1]) {
				count++;
			}
			else {
				max++;
				count=1;
			}
		}
		System.out.println(max);
}	
	
	public static void main(String[] args) {
	
		array();

	}

}
	

