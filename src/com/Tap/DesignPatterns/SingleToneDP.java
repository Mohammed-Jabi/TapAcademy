 package com.Tap.DesignPatterns;

import java.util.Scanner;

class Add{
	
	static Add d = new Add();
	
	private Add() {
		
	}
	
	public static Add getParameters() {
		return d;
	}
	
	void add(){
		System.out.println("Singleton Class Pattern.");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a+b;
		System.out.println(c);
	}
	
}

public class SingleToneDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Add d = Add.getParameters();
		d.add();

	}

}
