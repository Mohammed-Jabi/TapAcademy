package com.Tap.programs.strings;

import java.util.Scanner;

public class ToLowerString {
	
	static void toLowerCase(String s)
	{
		String t="";
		for(int i=0; i<=s.length(); i++)
		{
			char c=s.charAt(i);
			if(c<='A' && c>='Z')
			{
				t=t+(char)(c+32);
			}
			else
			{
				t=t+c;
			}
			
		}
		//return t
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		System.out.println(s.toLowerCase());

	}

}
