package com.Tap.Collections.LinkList;

import java.util.LinkedList;

public class FirstAddLastMethod {

	public static void main(String []args) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println(list);
		
		list.addLast(70);
		list.addFirst(80);
		System.out.println(list);


	}
}
