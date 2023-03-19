package com.Tap.programs;

import java.util.Scanner;

public class MultiOf5 {
	
	static void multiOF5N()
	{
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			
			System.out.print(5*i+" ");
			
		}
	}

	public static void main(String[] args) {

		multiOF5N();

	}

}



