package com.Tap.programs;

import java.util.Scanner;

public class Ins0inEvenArray {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		replaceEven(n);

	}

	static void replaceEven(int n) {

		Scanner scan = new Scanner(System.in);
		int a[] = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt(); 
		}

		for(int i=0; i<a.length; i++) {
			if(a[i]%2==0) {
				a[i]=0;
			}
			System.out.print(a[i]+" ");
		}
		
	}

}