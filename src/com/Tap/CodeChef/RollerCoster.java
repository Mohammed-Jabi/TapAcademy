package com.Tap.CodeChef;

import java.util.Scanner;

class RollerCoster {

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner (System.in); 
		int T=sc.nextInt(); 
		for(int i=0;i<T;i++) 
		{  
		    int x=sc.nextInt(); 
		    int y=sc.nextInt(); 
		    if(x<y) 
		    System.out.println("NO"); 
		    else 
		    System.out.println("YES"); 
		}
	}
}
