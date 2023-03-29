package com.Tap.Arrays;

import java.util.Scanner;

public class Practice {

	public static void main (String[] args) throws java.lang.Exception
	{
		

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[4];
		int count = 0;
		
		for(int i=0; i<4; i++) 
		{
			arr[i]= sc.nextInt();
			if (arr[i]>=10) 
			{
				count++;
			}
		}
		
		System.out.println(count);
		
	}
}
