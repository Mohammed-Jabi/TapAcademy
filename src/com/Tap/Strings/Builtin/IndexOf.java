package com.Tap.Strings.Builtin;

import java.util.Scanner;

public class IndexOf {
	
	static int indexOf(String s,String c)
	{
		char key=c.charAt(0);
		
		for(int i=0; i<=s.length(); i++)
		{
		
			if(s.charAt(i)==key)
			{
				return i;
			}
		}
		return 1;
	}
	
	public static void main(String [] args)
	{
		
	Scanner scan = new Scanner(System.in);
	String s=scan.nextLine();
	String c=scan.nextLine();
	System.out.println(indexOf(s,c));
	
	}

}
