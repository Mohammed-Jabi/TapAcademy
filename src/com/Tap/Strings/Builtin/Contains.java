package com.Tap.Strings.Builtin;

import java.util.Scanner;

public class Contains {
	
	static boolean contains(String s, String s1)
	{
		
		int count = 0;
		
		for(int i=0; i<s.length() && count<s1.length(); i++)
		{
			if(s.charAt(i) == s1.charAt(count))
			{
				count++;
			}
			else
			{
				count = 0;
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
		
		System.out.println(contains(s,s1));
	}

}

