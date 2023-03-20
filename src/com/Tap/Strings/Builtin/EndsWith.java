package com.Tap.Strings.Builtin;

import java.util.Scanner;

public class EndsWith {
	
	static boolean endsWith(String s, String s1)
	{
		int s3 = s.length() - s1.length();
		int count = 0;
		
		for(int i=s3; i<s.length(); i++)
		{
			if(s.charAt(i) == s1.charAt(count))
			{
				count++;
			}
		}
		if(s1.length() == count)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String s1 = scan.nextLine();
		
		System.out.println(endsWith(s,s1));
	}

}
