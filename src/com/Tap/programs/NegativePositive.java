package com.Tap.programs;

import java.util.Scanner;

public class NegativePositive {

	static void negativePositive()
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n>0 )
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Negative");
		}
	}

	public static void main(String[] args)
	{
		negativePositive();
	}
}