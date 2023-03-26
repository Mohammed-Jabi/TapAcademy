package com.Tap.programs;

import java.util.Scanner;

public class OccOfLargestNoArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		occOfLargest(n);

	}

	static void occOfLargest(int n) {

		Scanner scan = new Scanner(System.in);
		int a[] = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt(); 
		}
		int count=0;
		int larger=a[0];
		for(int i=0; i<a.length; i++)  {
			if(a[i]>larger) {
				larger=a[i];	
			}
		}
			for(int i=0; i<a.length; i++)  {
				if(a[i]==larger) {
					count++;	
				}	
			}
			System.out.println(count);
		}

	}