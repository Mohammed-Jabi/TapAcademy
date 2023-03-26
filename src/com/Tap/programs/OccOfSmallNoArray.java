package com.Tap.programs;

import java.util.Scanner;

public class OccOfSmallNoArray {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		occOfSmallest(n);

	}

	static void occOfSmallest(int n) {

		Scanner scan = new Scanner(System.in);
		int a[] = new int[n];
		for(int i=0; i<a.length; i++) {
			a[i] = scan.nextInt(); 
		}
		int count=0;
		int smal=a[0];
		for(int i=0; i<a.length; i++)  {
			if(a[i]<smal) {
				smal=a[i];	
			}
		}
			for(int i=0; i<a.length; i++)  {
				if(a[i]==smal) {
					count++;	
				}	
			}
			System.out.println(count);
		}

	}