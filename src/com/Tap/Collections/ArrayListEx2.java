package com.Tap.Collections;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();

		list.add(10);
		list.add("is");
		list.add('a');
		list.add("prime number");
		list.add(10.0);
		list.add("is");
		list.add('a');
		list.add("floting number");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			//return;
		}
		
	}

}