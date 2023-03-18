package com.Tap.programs;

import java.util.Scanner;

public class AsciiValue {
	
	static void asciiValue()
	{
	Scanner scan =	new Scanner(System.in);
	char c = scan.next().charAt(0);
	
	System.out.println((int)c);
	}

	public static void main(String[] args) {
		
		asciiValue();
	}

}
