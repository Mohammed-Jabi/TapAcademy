package com.Tap.Collections;

import java.util.ArrayList;

public class ArrayListOnlyFloat {

public static void main(String[] args) {
		
		ArrayList<Float> list = new ArrayList<Float>();

		list.add((float) 10.1);
		list.add((float) 20);
		list.add((float) 30);
		list.add((float) 40);
		list.add((float) 50.12);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}

