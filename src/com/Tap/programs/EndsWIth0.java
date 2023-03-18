package com.Tap.programs;

import java.util.Scanner;

public class EndsWIth0 {
	
	static void endsWith0()
	{
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		if(n % 10 == 0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

	public static void main(String[] args) {
	
		endsWith0();
		

	}

}
