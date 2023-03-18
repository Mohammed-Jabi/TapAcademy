package com.Tap.programs;

import java.util.Scanner;

public class MultipleOf10 {
	
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		if(n % 10 == 0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");	
		}

	}

}
