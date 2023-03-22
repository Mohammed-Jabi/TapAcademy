package com.Tap.programs;

import java.util.Scanner;

public class Swaping2No {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c;
		


		swaping2No(a,b);
	}

	private static void swaping2No(int a, int b) {

		int c=a;
		 a = b;
		 b = c;
		System.out.println(a+" "+b);


	}

}
