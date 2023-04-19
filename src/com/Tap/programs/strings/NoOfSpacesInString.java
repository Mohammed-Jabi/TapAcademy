package com.Tap.programs.strings;

import java.util.Scanner;

public class NoOfSpacesInString {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

	noOfSpaces(s);


	}

	static void noOfSpaces(String s) {

		int count=0;
		for(int i=0; i<s.length(); i++) {
		if(s.charAt(i) == ' ') {
			count++;
		}
		}
		System.out.println(count);
	}


}
