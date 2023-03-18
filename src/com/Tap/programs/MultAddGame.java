package com.Tap.programs;

import java.util.Scanner;

public class MultAddGame {
	
	static void multAddGame()
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int n1 = scan.nextInt();
		
		if((n+n1)%2==0 )
		{
			System.out.println(n*n1);
		}
		else
		{
			System.out.println(n+n1);
		}
	}

	public static void main(String[] args)
	{
		multAddGame();
	}
}
