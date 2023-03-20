package com.Tap.Strings.Builtin;

import java.util.Scanner;

public class replace {

	static char[] toCharArray(String s)
	{
		char[] c = new char[s.length()];

		for(int i=0; i<s.length(); i++)
		{
			c[i] = s.charAt(i);
		}
		return c;
	}

	static String replace(String s, char c, char c1)

	{

		char[]	s1 = toCharArray(s);
		for(int i=0; i<s1.length; i++)
		{
			if(s1[i] == c)
			{
				s1[i] = c1;
			}
			
		}
		return new String (s1);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char c = scan.next().charAt(0);
		char c1 = scan.next().charAt(0);
		//ToCharArray ch = new ToCharArray();
		System.out.println(replace( s,c,c1));


	}

}
