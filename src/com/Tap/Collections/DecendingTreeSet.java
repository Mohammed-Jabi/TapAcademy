package com.Tap.Collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2) * -1;
	}

}

class MyCompare1 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2) * -1;
	}

}


public class DecendingTreeSet {

	public static void main(String[] args) {
		MyCompare comp= new MyCompare();
		TreeSet<Integer> set	= new TreeSet<Integer>(comp);

		set.add(10);
		set.add(10);
		set.add(40);
		set.add(30);
		set.add(50);
		set.add(20);

		for(Integer x:set) {

			System.out.println(x);
		}

		MyCompare1 com= new MyCompare1();
		TreeSet<String> sets	= new TreeSet<String>(com);

		sets.add("Apple");
		sets.add("Mango");
		sets.add("Bat");
		sets.add("Apple");
		sets.add("Rat");
		sets.add("Zebra");
		sets.add("Voilet");

		for(String x:sets) {

			System.out.println(x);
		}

	}

}
