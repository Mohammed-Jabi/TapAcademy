package com.Tap.programs.strings;

import java.util.Scanner;

public class LargestPalindromeSubString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		largestSubStringPalindrom(s);


	}

	static void largestSubStringPalindrom(String s) {

		for(int i=s.length(); i>0; i--) {
			for(int j=0; j<=s.length()-i; j++) {
				String t = "";
				for(int k=j; k<i+j; k++) {
					t=t+s.charAt(k);
				}
				if(palindrome(t)) {
					System.out.println(t);
					return;
				}
			}

		}

	}





	static boolean palindrome(String t) {

		int i=0, j=t.length()-1;
		while(i<j) {
			if(t.charAt(i) != t.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}

