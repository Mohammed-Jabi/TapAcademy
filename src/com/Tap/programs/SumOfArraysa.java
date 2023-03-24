package com.Tap.programs;

import java.util.Scanner;

public class SumOfArraysa {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int[] array = new int[n];
		for(int i=0; i<array.length; i++) {
			array[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0; i<array.length; i++) {
				sum=sum+array[i];
			}
		System.out.println(sum);
		}
	}


