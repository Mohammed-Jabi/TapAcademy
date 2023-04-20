package com.Tap.programs.strings;

import java.util.Scanner;

public class RemoveUpperCharString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		removeUpperChar(s);


	}

	private static void removeUpperChar(String s) {
		String t="";
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if(!(ch>='A' && ch<='Z') ) {
				t=t+s.charAt(i);
			}
		}
		System.out.println(t);
	}
}