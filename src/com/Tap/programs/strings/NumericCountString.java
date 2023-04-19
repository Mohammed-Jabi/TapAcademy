package com.Tap.programs.strings;

import java.util.Scanner;

public class NumericCountString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		noOfNumeric(s);


	}

	private static void noOfNumeric(String s) {

		int count = 0;
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if(ch>='0' && ch<='9' ) {
				count++;
			}
		}
		System.out.println(count);
	}
}
