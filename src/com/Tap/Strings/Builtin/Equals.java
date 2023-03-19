package com.Tap.Strings.Builtin;

import java.util.Scanner;

public class Equals {

	static boolean equals(String s, String s1)
	{
		if (s.length() != s1.length())
		{
			return false;
		}
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) != s1.charAt(i))
			{
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String s = scan.nextLine();
	String s1 = scan.nextLine();
	
	System.out.println(equals(s,s1));
		
	}

}
