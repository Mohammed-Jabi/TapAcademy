package com.Tap.Arrays;

import java.util.Scanner;

public class InTwoD {
	
	public static void main (String[]args)
	{
		Scanner scan=new Scanner(System.in);

		int[][] a= {{10,20,30},{40,50}};
	

		for(int i = 0; i < a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.println(a[i][j]);

			}

		}
	}

}
