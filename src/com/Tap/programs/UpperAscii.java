package com.Tap.programs;

import java.util.Scanner;

public class UpperAscii {
	static void uppererAsciiValue()
	{
	Scanner scan =	new Scanner(System.in);
	int c = scan.nextInt();
	
	if(c>=65 && c<=90)
	{
		System.out.println("Yes");
	}
	else
	{
	System.out.println("No");	
	}
	}

	public static void main(String[] args) {
		
		uppererAsciiValue();
	}

}