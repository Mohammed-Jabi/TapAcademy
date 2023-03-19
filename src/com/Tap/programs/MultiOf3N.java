package com.Tap.programs;

import java.util.Scanner;

public class MultiOf3N {
	
	static void multiOF3N()
	{
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			
			System.out.print(3*i+" ");
			
		}
	}

	public static void main(String[] args) {

		multiOF3N();

	}

}
