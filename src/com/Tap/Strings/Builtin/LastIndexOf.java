package com.Tap.Strings.Builtin;

import java.util.Scanner;

public class LastIndexOf {
	static int lastIndexOf(String s,String c)
	{
		char key=c.charAt(0);

		for(int i=s.length()-1; i<=s.length(); i--)
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
		System.out.println(lastIndexOf(s,c));

	}

}



