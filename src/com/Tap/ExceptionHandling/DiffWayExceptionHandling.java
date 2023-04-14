package com.Tap.ExceptionHandling;

import java.util.Scanner;

class Demo{

	void fun1() throws ArithmeticException{

		Scanner scan = new Scanner(System.in);
		System.out.println("Connection is Established D1");

		try {
			System.out.println("Enter the Numerator");
			int a = scan.nextInt();
			System.out.println("Enter the Denominator");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ae) {
			System.out.println("Divide by zero erroe");
			throw ae;
		}

		finally {
			System.out.println("Connection Terminated D1");
		}

	}
}

public class DiffWayExceptionHandling {

	public static void main(String[] args) {

		System.out.println("Connection is established DM");
		try {
			Demo d1 = new Demo();                              
			d1.fun1();
		}

		catch(Exception e) {
			System.out.println("Reached Main also!");
		}
		System.out.println("Connection Terminated DM");
	}

}
