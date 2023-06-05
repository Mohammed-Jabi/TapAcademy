package com.Tap.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx2 {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		Scanner scan = new Scanner(System.in);
//		list.add(10);
//		list.add("is");
//		list.add('a');
//		list.add("prime number");
//		list.add(10.0);
//		list.add("is");
//		list.add('a');
//		list.add("floting number");
		int n = scan.nextInt();
		for(int j=0; j<n; j++) {
			list.add(scan.next());
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			//return;
		}
		
	}

}