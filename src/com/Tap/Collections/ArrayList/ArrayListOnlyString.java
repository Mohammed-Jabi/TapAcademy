package com.Tap.Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListOnlyString {

public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();

		list.add("My");
		list.add("Name");
		list.add("Is");
		list.add("Mohammed Jabir");
		list.add("s/o Mohammed Ismail ");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
