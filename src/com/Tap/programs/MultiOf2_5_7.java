package com.Tap.programs;

import java.util.Scanner;

public class MultiOf2_5_7 {
	
	static void multiOF2_5_7N()
	{
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(i % 2 == 0 ||i % 5 == 0 ||i % 7 == 0)
			{
			System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {

		multiOF2_5_7N();

	}

}

