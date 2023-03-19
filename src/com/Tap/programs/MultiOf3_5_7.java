package com.Tap.programs;

import java.util.Scanner;

public class MultiOf3_5_7 {
	
	static void multiOF3_5_7N()
	{
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n*2-1; i++)
		{
			if(i % 3 == 0 ||i % 5 == 0 ||i % 7 == 0)
			{
			System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {

		multiOF3_5_7N();

	}

}



