package com.Tap.programs;

import java.util.Scanner;

public class Fahren {
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	
	float fa=scan.nextFloat();
	
	int c = (int) fa - 32 * 5/9;
	
	System.out.println(c);
	}
}
