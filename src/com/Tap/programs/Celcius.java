package com.Tap.programs;

import java.util.Scanner;

public class Celcius {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		
		int c = scan.nextInt();
		
		float f = c* 9/5f + 15;
		
		System.out.println(f);
		
	}

}
