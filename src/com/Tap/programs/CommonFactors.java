package com.Tap.programs;

import java.util.Scanner;

public class CommonFactors {

	static void factorsOfNumber(int n, int n1)
	{
		
		
		for(int i=1; i<=n; i++)
		{
			if(n%i==0 && n1%i==0)
			{
				System.out.print(i+" ");
			}
		}
	
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int n1= scan.nextInt();
		factorsOfNumber(n,n1);
	}
}
