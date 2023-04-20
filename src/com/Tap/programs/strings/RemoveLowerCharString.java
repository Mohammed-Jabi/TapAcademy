package com.Tap.programs.strings;

import java.util.Scanner;

public class RemoveLowerCharString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		removeLowerChar(s);


	}

	private static void removeLowerChar(String s) {
		String t="";
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if(!(ch>='a' && ch<='z') ) {
				t=t+s.charAt(i);
			}
		}
		System.out.println(t);
	}
}