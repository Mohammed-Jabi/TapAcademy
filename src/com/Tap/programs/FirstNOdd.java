package com.Tap.programs;

import java.util.Scanner;

public class FirstNOdd {

	static void fistOddNo()
	{
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n*2; i++)
		{
			if(i % 2 !=0) 
			{
			System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {

		fistOddNo();

	}

}
	

