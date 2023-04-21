package com.Tap.programs.strings;

import java.util.Scanner;

public class Str2InStr1Strings {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t = scan.nextLine();
		string2in1(s,t);


	}

	static void string2in1(String s, String t) {

		int i=0, j=0;
		
		while(j<t.length() && i<s.length()) {
			if(s.charAt(i) == t.charAt(j)) {
				i++;
				j++;
			}
			else {
				i++;
			}
		}
		if(j == t.length()) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
