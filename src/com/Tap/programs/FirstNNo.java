package com.Tap.programs;

import java.util.Scanner;

public class FirstNNo {

	static void firstNNo() {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args)
	{
		firstNNo();
	}

	
	
}
