package com.Tap.OOPs;

import java.util.Scanner;

interface Calculator {
	
	void add();
	void sub();

}


class Calculator1 implements Calculator{

	public void add() {
		int a = 100;
		int b = 200;
		int c = a+b;
		System.out.println(c);
	}

	public void sub() {
		int a = 100;
		int b = 200;
		int c = a-b;
		System.out.println(c);
	}
	
}

class Calculator2 implements Calculator{

	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = scan.nextInt();		
		System.out.println("Enter the second number:");	
		int b = scan.nextInt();
		System.out.println(a+b);
		
	}

	public void sub() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = scan.nextInt();		
		System.out.println("Enter the second number:");	
		int b = scan.nextInt();
		System.out.println(a-b);
		
		
	}
	
}

class Calculator3 implements Calculator{

	public void add() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = scan.nextInt();		
		System.out.println("Enter the second number:");	
		int b = scan.nextInt();
		System.out.println(a+b);
		
	}


	public void sub() {

		
	}
	
}

public class Interface {

	public static void main(String[] args) {
		
	}

}
