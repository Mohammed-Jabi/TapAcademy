package com.Tap.programs;

import java.util.Scanner;

public class Arrays {
	
	static void array(int n) {
		
		int ar[]= new int[n]; 
		for(int i=0; i<ar.length; i++) {
		System.out.println(ar[i]);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		array(n);
		
	}

}
