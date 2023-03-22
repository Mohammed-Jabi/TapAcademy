package com.Tap.Strings.Builtin;

import java.util.Scanner;

public class SubStringIndex {
	
	static String subString(String s, int starts,int ends) 
	{

		String t="";
		for(int i=starts; i<ends; i++)
		{
			t = t+s.charAt(i);
		}

		return  t;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int starts = scan.nextInt();
		int ends = scan.nextInt();
		System.out.println(subString(s,starts,ends));
	}

}



