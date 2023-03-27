package com.Tap.CodeChef;

import java.util.Scanner;

class WhoIsTaller {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in); 
		int T=sc.nextInt(); 
		for(int i=0;i<T;i++) 
		{  
			int x=sc.nextInt(); 
			int y=sc.nextInt(); 
			if(x<y) 
				System.out.println("B"); 
			else 
				System.out.println("A"); 
		}
	}
}
