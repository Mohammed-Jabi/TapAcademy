package com.Tap.programs;

import java.util.Scanner;

public class LowerAscii {

	static void lowerAsciiValue()
	{
	Scanner scan =	new Scanner(System.in);
	int c = scan.nextInt();
	
	if(c>=97 && c<=122)
	{
		System.out.println("Yes");
	}
	else
	{
	System.out.println("No");	
	}
	}

	public static void main(String[] args) {
		
		lowerAsciiValue();
	}

}



