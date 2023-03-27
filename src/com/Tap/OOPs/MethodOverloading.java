package com.Tap.OOPs;

import java.util.Scanner;

class Calc{
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(int a, float b) {
		System.out.println(a+b);
	}
	void add(float a, int b) {
		System.out.println(a+b);
	}
	void add(int a, double b) {
		System.out.println(a+b);
	}
	void add(double a, int b) {
		System.out.println(a+b);
	}
	void add(float a, float b) {
		System.out.println(a+b);
	}
	void add(double a, double b) {
		System.out.println(a+b);
	}
	void add(int a, int b, int c) {
		System.out.println(a+b);
	}
	void add(int a, float b, int c) {
		System.out.println(a+b);
	}
	void add(float a, int b, float c) {
		System.out.println(a+b);
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		Calc c = new Calc();
		int n1=10, n2=20, n3=30;
		float n4=10.1f, n5=12.8f;
		double n6=123.123, n7=134.123;
		c.add(n1, n2);
				
	}

}
