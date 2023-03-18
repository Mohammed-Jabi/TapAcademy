package com.Tap.programs;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		if(n % 2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
		System.out.println("Odd");	
		}

	}

}
