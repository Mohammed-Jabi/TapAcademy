package com.Tap.programs;

import java.util.Scanner;

public class ThreeNoMul2_5_10 {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		if(n % 2 == 0  && n % 5 == 0  &&n % 10 == 0 )
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");	
		}

	}

}
