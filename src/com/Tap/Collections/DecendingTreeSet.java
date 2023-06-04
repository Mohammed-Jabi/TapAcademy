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

class MyCompare2 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		Integer l1 = o1.length();
		Integer l2 = o2.length();
		
		if(l1.compareTo(l2)==0) {
			return o1.compareTo(o2);
		}
		
		return l1.compareTo(l2) ;
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
		System.out.println();

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
		
		System.out.println();
		
		MyCompare2 co= new MyCompare2();
		TreeSet<String> sets1	= new TreeSet<String>(co);

		sets1.add("Apple");
		sets1.add("Mango");
		sets1.add("Bat");
		sets1.add("Apple");
		sets1.add("Rat");
		sets1.add("Zebra");
		sets1.add("Voilet");

		for(String x:sets1) {
			
			System.out.println(x);
		}
		
		

	}

}
