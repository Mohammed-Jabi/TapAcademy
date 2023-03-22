package com.Tap.programs;

import java.util.Scanner;

public class CommonMultiples {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		
		commonMultiles(n,n1,n2);
	}
// Should solve pending
	 static void commonMultiles(int n, int n1, int n2) {
		
		 int count=0;
		 
		 for(int i=1; i<=10; i++)
		 {
			 if(n%i==0 && n1%i==0)
			 {
				 System.out.println(i+" ");
				 //count++;
			 }
		 }
		
	}
	 
}
