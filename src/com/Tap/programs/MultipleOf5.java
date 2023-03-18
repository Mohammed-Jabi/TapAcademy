package com.Tap.programs;

import java.util.Scanner;

public class MultipleOf5 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		if(n % 5 == 0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");	
		}

	}
}