package com.Tap.programs;

import java.util.Scanner;

public class MultiOf2N {
	
	static void multiOF2N()
	{
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			
			System.out.print(2*i+" ");
			
		}
	}

	public static void main(String[] args) {

		multiOF2N();

	}

}


