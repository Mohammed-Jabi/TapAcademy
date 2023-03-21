package com.Tap.CodeChef;

import java.util.Scanner;

public class Importantpages {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
	    int A=scan.nextInt();
	    int B=scan.nextInt();
	    if(A==1 && B==1)
	    {
	        System.out.println("https://discuss.codechef.com");
	    }
	    else if(A==1 && B==0)
	    {
	         System.out.println("https://www.codechef.com/contests");
	    }
	    else
	    {
	        System.out.println("https://www.codechef.com/practice");
	    }
	}
}
