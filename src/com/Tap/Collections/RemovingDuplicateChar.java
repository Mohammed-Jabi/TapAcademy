package com.Tap.Collections;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemovingDuplicateChar {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String s = scan.next();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>(); 
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			set.add(ch);
		}
		
		for(Character x:set) {
			
			System.out.print(x);
		}
		
	}

}
