package com.Tap.programs;

import java.util.Scanner;

public class TwoDigNo {
	
	static void Number()
	{
		Scanner scan=new Scanner(System.in);
		
		int n = scan.nextInt();
		if(n>=10 && n<=99)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");	
		}
	}

	public static void main(String[] args) {
		
		Number();

	}

}
