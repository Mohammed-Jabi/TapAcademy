package com.Tap.programs;

import java.util.Scanner;

public class FactorsOfANo {

	static void factorsOfNumber()
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 0;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args)
	{
		
		factorsOfNumber();
	}
}
