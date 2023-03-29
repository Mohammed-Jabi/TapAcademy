package com.Tap.programs.arrays;

import java.util.Scanner;

public class SwapingArrayIndex {
//Inproper code
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		swapingIndex(n);

	}

	static void swapingIndex(int n) {

		Scanner scan = new Scanner(System.in);
		int a[] = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt(); 
		}
		System.out.println("Before Swaping");
		System.out.println("Even index elements:");
		for(int i=0; i<a.length; i++) {
			if(i%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println("");
		System.out.println("Odd index elements:");
			
		for(int i=0; i<a.length; i++) {
				if(i%2!=0) {
					System.out.print(a[i]+" ");
				}
			}
			
			System.out.println("After Swaping");
			System.out.println("Even index elements:");
			for(int i=0; i<a.length; i++) {
				if(i%2==0) {
					System.out.print(i%2!=0 + (a[i]));
				}
			}
			System.out.println("");
			System.out.println("Odd index elements:");
				for(int i=0; i<a.length; i++) {
					if(i%2!=0) {
						System.out.print(i%2==0 + (a[i]));
					}
				}
				

	}
}
