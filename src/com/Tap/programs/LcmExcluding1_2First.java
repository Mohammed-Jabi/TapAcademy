package com.Tap.programs;

import java.util.Scanner;

public class LcmExcluding1_2First {

	static void hcf2ndMethod(int n, int n1)
	{
		int min=0;
		if(n>n1)
		{
			min=n1;
		}
		else
		{
			min=n;
		}
		for(int i=3; i<=min; i++)
		{
			if(n%i==0 && n1%i==0)
			{
				System.out.println(i);
				break;

			}
		}
	}

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int n1 = scan.nextInt();

		hcf2ndMethod(n,n1);
	}

}



