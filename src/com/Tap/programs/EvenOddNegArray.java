package com.Tap.programs;

import java.util.Scanner;

public class EvenOddNegArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] array = new int[n];
		for(int i=0; i<array.length; i++) {
			array[i]=scan.nextInt();
		}

		for(int i=0; i<array.length; i++) {
			if(array[i]>0 && array[i]%2==0) {
				System.out.print(array[i]+" ");
			}
		}
		System.out.println("");
			for(int i=0; i<array.length; i++) {
				if(array[i]>0 && array[i]%2!=0) {
					System.out.print(array[i]+" ");
				}
			}
			System.out.println("");
			for(int i=0; i<array.length; i++) {
				if(array[i]<0) {
					System.out.print(array[i]+" ");
				}
			}


	}

}