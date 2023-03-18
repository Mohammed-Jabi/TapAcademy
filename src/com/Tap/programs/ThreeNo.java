package com.Tap.programs;

import java.util.Scanner;

public class ThreeNo {
	
	static void Number()
	{
		Scanner scan=new Scanner(System.in);
		
		int n = scan.nextInt();
		if(n>=100 && n<=999)
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


