package com.Tap.Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {

	HashSet<Integer> set = new HashSet<Integer>();
	
	set.add(null);
	set.add(null);
	set.add(10);
	set.add(40);
	set.add(70);
	set.add(30);
	
	System.out.println(set);
	
	LinkedHashSet set1 = new LinkedHashSet<Integer>();
	
	
	set1.add(null);
	set1.add(null);
	set1.add(10);
	set1.add(40);
	set1.add(70);
	set1.add(30);
	
	System.out.println(set1);
	
	TreeSet<Integer> set2 = new TreeSet<Integer>();

	//set2.add(null);
	//set2.add(null);
	set2.add(10);
	set2.add(40);
	set2.add(70);
	set2.add(30);
	
	System.out.println(set2);
	
	}

}
