package com.Tap.programs;

import java.util.Scanner;

public class ArrayPNo {

	static void array(int n) {
		
		int ar[]= new int[n]; 
		for(int i=0; i<ar.length; i++) {
		ar[i]=i+1;
		System.out.print(ar[i]+" ");
		}
	//
}	
	public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			array(n);
			
		}

	}
