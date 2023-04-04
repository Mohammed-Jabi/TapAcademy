package com.Tap.CodeChef;

import java.util.Scanner;

public class MatchStricks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ar[]= {6,2,5,5,4,5,6,3,7,8};
		int t = scan.nextInt();
		for(int i=0; i<t; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int n = a+b;
			int rem, sum=0;
			while(n>0) {
				rem=n%10;
				sum= sum+ar[rem];
				n=n/10;
			}
			System.out.println(sum);
		}

	}

}
