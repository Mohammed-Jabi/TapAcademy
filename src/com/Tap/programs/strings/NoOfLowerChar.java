package com.Tap.programs.strings;

import java.util.Scanner;

public class NoOfLowerChar {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		noOfLowerChar(s);


	}

	private static void noOfLowerChar(String s) {

		int count = 0;
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if( ch>='a' && ch<='z') {
				count++;
			}
		}
		System.out.println(count);
	}
}
