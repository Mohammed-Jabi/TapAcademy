package com.Tap.CodeChef;

import java.util.Scanner;

public class Thethreetpics {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int X = scan.nextInt();

		if(X==A || X==B || X==C)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
