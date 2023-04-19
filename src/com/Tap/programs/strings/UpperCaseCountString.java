package com.Tap.programs.strings;

import java.util.Scanner;

public class UpperCaseCountString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		noOfUpperCase(s);


	}

	private static void noOfUpperCase(String s) {

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