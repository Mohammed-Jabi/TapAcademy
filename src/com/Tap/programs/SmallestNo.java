package com.Tap.programs;

import java.util.Scanner;

public class SmallestNo {
	
	static void smallestNo()
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int n1 = scan.nextInt();
		
		if(n<n1)
		{
			System.out.println(n);
		}
		else
		{
			System.out.println(n1);
		}
	}
	
	public static void main(String[] args) {
		
		smallestNo();
		
	}

}
