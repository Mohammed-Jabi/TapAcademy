package com.Tap.programs.strings;

import java.util.Scanner;

public class StringIsPalindOptSol {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		
		Boolean bool = palindrome(s);
		System.out.println(bool);

	}

	public static Boolean palindrome(String s) {
		
		int i=0, j=s.length()-1;
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}