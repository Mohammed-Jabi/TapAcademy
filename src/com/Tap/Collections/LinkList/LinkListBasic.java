package com.Tap.Collections.LinkList;

import java.util.LinkedList;

public class LinkListBasic {

public static void main(String []args) {

	LinkedList<Integer> list = new LinkedList<Integer>();
	
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	
	System.out.println(list);
	list.removeFirst();
	//list.addLast();
	//list.addFirst();
	//list.removeLast();
	//list.getFirst();
	//list.getLast();
	System.out.println(list);
	
	
}
}
