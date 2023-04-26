package com.Tap.programs.strings;

import java.util.Scanner;

public class NoOfSubStrings {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		noAllAubStringPalindrom(s);
		
		
	}

	static void noAllAubStringPalindrom(String s) {
		int count=0;
		for(int i=1; i<=s.length(); i++) {
			for(int j=0; j<=s.length()-i; j++) {
				String t = "";
				
				for(int k=j; k<i+j; k++) {
					count++;
				}
				
			}
		
		}
		System.out.println(count);
	}
}
