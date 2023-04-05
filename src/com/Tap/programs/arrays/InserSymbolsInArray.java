package com.Tap.programs.arrays;

import java.util.Scanner;

public class InserSymbolsInArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		insertSysmbols(n);

	}

	private static void insertSysmbols(int n) {
		
		Scanner scan = new Scanner(System.in);
		int a[] = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt(); 
		}
		
		for(int i=0; i<a.length-1; i++) {
			if(a[i] % 2 != 0 && a[i] % 2 != 0 ) {
				System.out.print(a[i]+" * ");
			}
			else if(a[i] % 2 == 0 && a[i] % 2 == 0 ) {
				System.out.print(a[i]+" $ ");
			}
			else {
				System.out.print(a[i]+" # ");
			}
		}
		System.out.println(a[a.length-1]);
	}

}
