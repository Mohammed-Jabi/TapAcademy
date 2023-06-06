package com.Tap.maps;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class OccerinigM3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


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
		int pairs =0;
		Set<Entry<Character,Integer>> entrySet = map.entrySet();
		
		for(Entry<Character,Integer> e : entrySet) {
			if(e.getValue()>3) {
				System.out.println(e.getKey());
			}
				
			
		}
		
		
	}

}
