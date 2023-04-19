package com.Tap.programs.strings;

import java.util.Scanner;

public class CharInNewLineString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
	reverse(s);
		

	}

	static void reverse(String s) {
		String S1 = "";
		for(int i=0; i<s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	
	}

}
