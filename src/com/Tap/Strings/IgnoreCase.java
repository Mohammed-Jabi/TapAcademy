package com.Tap.Strings;

public class IgnoreCase {
	
	public static void name(String[] args) 
	{
		
		String s1=new String("JAVA");
		String s2=new String("Java");
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Java");
		}
		else
		{
			System.out.println("Sorry");
		}
		
		
	}

}
