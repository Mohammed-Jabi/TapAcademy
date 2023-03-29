package com.Tap.programs.arrays;

import java.util.Scanner;

public class EvenArrayInRev {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] array = new int[n];
		for(int i=0; i<array.length; i++) {
			array[i]=scan.nextInt();
		}
		
		for(int i=array.length-1; i>0; i--) {
			if(array[i]%2==0) {
				System.out.println(array[i]);
			}		
		}
	}

}

