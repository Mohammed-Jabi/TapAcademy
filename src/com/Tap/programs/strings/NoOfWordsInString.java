package com.Tap.programs.strings;

import java.util.Scanner;

public class NoOfWordsInString {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

	noOfWords(s);


	}

	static void noOfWords(String s) {

		int count=0;
		for(int i=0; i<s.length(); i++) {
		if(s.charAt(i) == ' ' && s.charAt(i+1) !=' ') {
			count++;
		}
		}
		System.out.println(++count);//count++
	}


}
