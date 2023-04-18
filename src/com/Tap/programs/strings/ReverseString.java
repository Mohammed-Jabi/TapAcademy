package com.Tap.programs.strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		String res=reverse(s);
		System.out.println(res);

	}

	static String reverse(String s) {
		String S1 = "";
		for(int i=s.length()-1; i>=0; i--) {
			S1=S1+s.charAt(i);
		}
		return S1;
	}

}
