package com.Tap.programs.strings;

import java.util.Scanner;

public class RemoveSpecialCharString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		noSpecialChar(s);


	}

	private static void noSpecialChar(String s) {
		String t="";
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9') {
				t=t+s.charAt(i);
			}
		}
		System.out.println(t);
	}
}