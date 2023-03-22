package com.Tap.Strings.Builtin;

import java.util.Scanner;

public class SubString {
	static String subString(String s, int starts) {

		String t="";
		for(int i=starts; i<s.length(); i++)
		{
			t = t+s.charAt(i);
		}

		return  t;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int starts = scan.nextInt();
		System.out.println(subString(s,starts));
	}

}
