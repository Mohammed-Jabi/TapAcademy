package com.Tap.Strings.Builtin;

import java.util.Scanner;

public class Trim {
	
	static String trim(String s)
	{
		String t="";
		char c=s.charAt(0);
		int si=0 ,ei=0;
		for(int i=0; i<=s.length(); i++)
		{
			if(c!=' ')
			{
				si=i;
				break;
			}
			
		}
		for(int i=s.length()-1; i<=s.length(); i--)
		{
			if(c!=' ')
			{
				ei=i;
				break;
			}
			
		}
		for(int i=si; i<=ei; i++)
		{
			t=t+c;
		}
		return t;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(s.trim());

	}

}
