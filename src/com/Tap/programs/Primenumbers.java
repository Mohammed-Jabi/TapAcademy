package com.Tap.programs;

import java.util.Scanner;

public class Primenumbers {
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
	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(isPrime(n));
	}
}
