package com.Tap.CodeChef;

import java.util.Scanner;

class GetSubscription {
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		 int t =  scan.nextInt();
		 for(int i=0; i<t; i++)
		 {
		     int X = scan.nextInt();
		     if(X<=30)
		     {
		         System.out.println("NO");
		     }
		     else
		     {
		         System.out.println("YES");
		     }
		 }
	}
}