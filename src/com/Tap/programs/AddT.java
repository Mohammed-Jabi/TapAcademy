package com.Tap.programs;

import java.util.Scanner;

public class AddT {
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		
		int a= scan.nextInt();
		int b= scan.nextInt();
		int c= scan.nextInt();
		System.out.println(a+b);
		System.out.println(a+c);
		System.out.println(b+c);
	}

}
