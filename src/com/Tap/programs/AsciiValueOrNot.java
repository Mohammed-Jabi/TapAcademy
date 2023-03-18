package com.Tap.programs;

import java.util.Scanner;

public class AsciiValueOrNot {

	static void asciiValueOrNot()
	{
	Scanner scan =	new Scanner(System.in);
	int c = scan.nextInt();
	
	if(c>=0 && c<=127)
	{
		System.out.println("Yes");
	}
	else
	{
	System.out.println("No");	
	}
	}

	public static void main(String[] args) {
		
		asciiValueOrNot();
	}

}

