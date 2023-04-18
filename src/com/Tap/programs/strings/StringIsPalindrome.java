package com.Tap.programs.strings;

import java.util.Scanner;

public class StringIsPalindrome {

	
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		palindrome(s);
		

	}

	static void palindrome(String s) {
		String S1 = "";
		for(int i=s.length()-1; i>=0; i--) {
			S1=S1+s.charAt(i);
		}
		if(S1.equals(s)) {
			System.out.println("Is a Plaindrome");
		}
		else {
			System.out.println("Not a Plalindrome");
		}
		
	}

}

