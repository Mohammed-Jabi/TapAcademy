package com.Tap.programs;

import java.util.Scanner;

public class Multiple3_5_7 {
	
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		if(n % 3 == 0  && n % 5 == 0  &&n % 7 == 0 )
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");	
		}

	}

}
