package com.Tap.programs.arrays;

import java.util.Scanner;

public class SumOfLarAndSecondLargArray {

	static void array() 
	{

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ar[]= new int[n];
		for(int i=0; i<ar.length; i++) 
		{
			ar[i]=scan.nextInt();
		}

		int larg=Integer.MIN_VALUE; int slarg=Integer.MIN_VALUE;

		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]> larg) {
				slarg=larg;
				larg=ar[i];
			}
			else if(ar[i]>slarg){
				slarg=ar[i];
			}
		}
		System.out.println(larg*slarg);

	}	
	public static void main(String[] args) {


		array();

	}


}
