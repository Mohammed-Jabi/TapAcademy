package com.Tap.programs.strings;

import java.util.Scanner;

public class NoOfCharString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		noOfVovels(s);


	}

	private static void noOfVovels(String s) {

		int count = 0;
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				count++;
			}
		}
		System.out.println(count);
	}
}