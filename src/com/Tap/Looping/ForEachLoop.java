package com.Tap.Looping;

import java.util.Scanner;

public class ForEachLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=scan.nextInt();
		}
//		for(int i=0; i<n; i++) {
//			System.out.print(arr[i]+" ");	
//		}
		arrayMethod(arr);
	}

	static void arrayMethod(int[] arr) {
		for(int x:arr) {
			System.out.print(x + " ");
		}	
	}

}
