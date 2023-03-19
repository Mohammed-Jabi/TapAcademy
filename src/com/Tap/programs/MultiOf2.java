package com.Tap.programs;

import java.util.Scanner;

public class MultiOf2 {

	static void multiOf2()
	{
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(i % 2 ==0) 
			{
			System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {

		multiOf2();

	}

}

