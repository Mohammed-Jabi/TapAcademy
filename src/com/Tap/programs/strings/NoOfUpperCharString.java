package com.Tap.programs.strings;

import java.util.Scanner;

public class NoOfUpperCharString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		noOfUpperChar(s);


	}

	private static void noOfUpperChar(String s) {

		int count = 0;
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if( ch>='A' && ch<='Z') {
				count++;
			}
		}
		System.out.println(count);
	}
}
