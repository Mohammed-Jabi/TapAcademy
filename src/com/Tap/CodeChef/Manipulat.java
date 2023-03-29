package com.Tap.CodeChef;

import java.util.Scanner;

public class Manipulat {

	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    for(int i=0;i<n;i++){
	        int a=s.nextInt();
	        int b=s.nextInt();
	        if(a<b)
	        System.out.println("YES");
	        else
	        System.out.println("NO");
	    }
		
	}
}
