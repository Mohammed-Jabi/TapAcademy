package com.Tap.programs;

import java.util.Scanner;

public class SmallestNo3 {static void largestNo3()
{
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	int n1 = scan.nextInt();
	int n2 = scan.nextInt();
	
	if(n<n1)
	{
		if(n<n2)
		{
			System.out.println(n);
		}
		else
		{
			System.out.println(n2);
		}
		
	}
	else if(n1<n2)
	{
		System.out.println(n1);
	}
	else
	{
		System.out.println(n2);
	}
}

public static void main(String[] args) {
	
	largestNo3();
	
}

}
