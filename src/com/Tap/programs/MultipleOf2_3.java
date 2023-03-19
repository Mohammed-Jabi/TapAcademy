package com.Tap.programs;

import java.util.Scanner;

public class MultipleOf2_3 {
	
	static void multiOF2_3N()
	{
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(i%2==0 || i%3==0)
			{
			System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {

		multiOF2_3N();

	}

}


