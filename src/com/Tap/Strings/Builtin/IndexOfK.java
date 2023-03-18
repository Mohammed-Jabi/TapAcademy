package com.Tap.Strings.Builtin;

import java.util.Scanner;

public class IndexOfK {

	static int indexOfK(String s, String c, int k)
	{
		char key = c.charAt(0);
		int count=0;

		for(int i=0; i<=s.length(); i++)
		{
			if(s.charAt(i)==key)
			{
				count++;
			}
			if(count==k)
			{
				return i;
			}

		}
		return -1;
	}

	public static void main(String[] args)
	{

		Scanner scan =	new Scanner(System.in);
		String s = scan.nextLine();
		String c = scan.nextLine();
		int k = scan.nextInt();

		System.out.println(indexOfK(s,c,k));

	}

}
