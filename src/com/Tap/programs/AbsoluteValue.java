package com.Tap.programs;

import java.util.Scanner;

public class AbsoluteValue {

	static void absoluteValue()
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n<0)
		{
			System.out.println(-n);
		}
		else
		{
			System.out.println(n);
		}

	}
	public static void main(String[] args) {

		absoluteValue();
		
	}

}
