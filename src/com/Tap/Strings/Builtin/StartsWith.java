package com.Tap.Strings.Builtin;

import java.util.Scanner;

public class StartsWith {
	
	static boolean startsWith(String s, String s1)
	{
		int count = 0;
		for(int i=0; i<s1.length(); i++)
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
		
		System.out.println(startsWith(s,s1));
		
	}

}
