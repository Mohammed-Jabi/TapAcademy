package com.Tap.programs;

import java.util.Scanner;

public class MultipleOf3_5 {
	
	static void Multi()
	{
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		if(n % 5 == 0 && n % 3 == 0 && n % 7 == 0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");	
		}
	}

	public static void main(String[] args) {
		
		Multi();

	}

}
