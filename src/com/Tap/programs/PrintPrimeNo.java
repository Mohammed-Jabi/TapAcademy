package com.Tap.programs;

import java.util.Scanner;

public class PrintPrimeNo {
	static boolean isPrime(int n)
	{
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	static void printPrime(int n)
	{
		for(int i=2; i<=n; i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printPrime(n);
	}
}