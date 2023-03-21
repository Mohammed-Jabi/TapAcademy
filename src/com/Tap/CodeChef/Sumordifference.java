package com.Tap.CodeChef;

import java.util.Scanner;

public class Sumordifference {
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner scan	= new Scanner(System.in);
		int N1 = scan.nextInt();
		int N2 = scan.nextInt();

		if(N1 > N2 )
		{
			System.out.println(N1 - N2);
		}
		else
		{
			System.out.println(N1 + N2);
		}
	}
}
