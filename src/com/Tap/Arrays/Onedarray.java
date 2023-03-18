package com.Tap.Arrays;

import java.util.Scanner;

public class Onedarray {
	
	public static void main(String [] args)
	{
	Scanner	scan =new Scanner(System.in);
	
	int [] a=new int[10];
	for(int i=0; i<a.length; i++)
	{
		System.out.println("Enter the age's");
		a[i]=scan.nextInt();
	}
	System.out.println("The age's are");
	for(int i=0; i<10; i++)
	{
		System.out.println(a[i]);
	}
	}

}
