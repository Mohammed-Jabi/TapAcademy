package com.Tap.programs.strings;

import java.util.Scanner;

public class AllSubStrings {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		allAubStringPalindrom(s);
		
		
	}

	static void allAubStringPalindrom(String s) {
		
		for(int i=1; i<=s.length(); i++) {
			for(int j=0; j<=s.length()-i; j++) {
				String t = "";
				for(int k=j; k<i+j; k++) {
					t=t+s.charAt(k);
				}
				System.out.println(t);
			}
		}
		
	}
}