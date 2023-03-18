package com.Tap.programs;

import java.util.Scanner;

public class EquivalentAscii {

	static void asciiValue()
	{
	Scanner scan =	new Scanner(System.in);
	int c = scan.nextInt();
	
	System.out.println((char)c);
	}

	public static void main(String[] args) {
		
		asciiValue();
	}

}

