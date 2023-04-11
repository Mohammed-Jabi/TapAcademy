package com.Tap.ExceptionHandling;

import java.util.Scanner;

public class TryCatch {
	
	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter the Numerator");
			int a = scan.nextInt();
			System.out.println("Enter the Denominator");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Divide by zero erroe");
		}
		
	}

}
