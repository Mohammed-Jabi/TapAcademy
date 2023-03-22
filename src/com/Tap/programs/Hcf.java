package com.Tap.programs;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int n1 = scan.nextInt();
		
		hcf(n,n1);
	}

	 static void hcf(int n, int n1)
	 {
		int count=0;
		int min;
		if(n>n1)
		{
			min=n1;
		}
		else
		{
			min=n;
		}
		for(int i=1; i<=min; i++)
		{
			if(n%i==0 && n1%i==0)
			{
				count=i;
			}
		}
		System.out.println(count);
	}

}
