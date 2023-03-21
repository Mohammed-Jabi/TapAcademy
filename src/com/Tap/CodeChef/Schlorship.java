package com.Tap.CodeChef;

import java.util.Scanner;

public class Schlorship {
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
	    int R = scan.nextInt();
	    if(R<=50)
	    System.out.println(100);
	   else if(R>50 && R<=100)
	    System.out.println(50);
	    else
        System.out.println(0);
	}
}