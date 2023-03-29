package com.Tap.programs.arrays.sorted;

import java.util.Scanner;

public class ArrayMaxOccEle {
static void array() {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar[]= new int[n];
		for(int i=0; i<ar.length; i++) {
			ar[i]=scan.nextInt();
		}
		int count=1, ele=0, max=0;
		for(int i=0; i<ar.length-1; i++) {
			if(ar[i] == ar[i+1]) {
				count++;
			}
			else {
				if(count>max) {
					max = count;
					ele = ar[i];
				}
				count=1;
			}
		}
		if(count>max) {
			max = count;
			ele = ar[ar[ar.length-1]];
		}
		count=1;
		System.out.println(ele);
		
	}	
	
	public static void main(String[] args) {
	
		array();

	}

}
