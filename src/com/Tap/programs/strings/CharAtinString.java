package com.Tap.programs.strings;

import java.util.Scanner;

public class CharAtinString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char ch = scan.next().charAt(0);

	indexOf(s, ch);


	}

	static void indexOf(String s, char ch) {
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==ch) {
				System.out.println(i);
				System.exit(0);
			}
		}
		System.out.println("-1");
	}

}

