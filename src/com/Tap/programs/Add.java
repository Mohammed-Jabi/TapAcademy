package com.Tap.programs;

import java.util.Scanner;

public class Add {

	public static void main(String [] args)
	{
	Scanner scan=new Scanner(System.in);
	
	int a= scan.nextInt();
	int b= scan.nextInt();
	
	//three number
	int c= scan.nextInt();
	int sum=a+b+c;
	
	System.out.println(sum);
	}
}
