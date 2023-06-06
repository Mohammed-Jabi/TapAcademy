package com.Tap.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ProgramEx2 {

	public static void main(String[] args) {

		Scanner scan = 	new Scanner(System.in);
		String s = scan.next();

		LinkedHashMap<Character,Integer> map = new LinkedHashMap<Character, Integer>();

		for(int i=0; i<s.length(); i++ ) {
			char ch =s.charAt(i);
			if(map.containsKey(ch)) {
				int c = map.get(ch);
				map.put(ch, c+1);
			}
			else {
				map.put(ch, 1);
			}

		}
		//System.out.println(map);
		String res="";
		Set<Entry<Character,Integer>> entrySet = map.entrySet();
		
		for(Entry<Character,Integer> e : entrySet) {
			res = res + e.getKey()+e.getValue();
		}
		System.out.println(res);
		
	}

}
