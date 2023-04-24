package com.Tap.programs.strings;

import java.util.Scanner;

public class SubStringPalendrome {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int n=scan.nextInt();
		subStringPalindrom(s, n);
		//palindrome(s);
		
	}

	static void subStringPalindrom(String s, int n) {
	
		for(int i=0; i<=s.length()-n; i++) {
			String t="";
			for(int j=i; j<n+i; j++) {
				t=t+s.charAt(j);
			}
			if(palindrome(t)) {
				System.out.println(t);	
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
