package com.Tap.Arrays;

import java.util.Scanner;

public class Threedarray {

	public static void main(String[] args)
	{

		Scanner scan=new Scanner(System.in);

		int[][][] a=new int [2][3][3];

		for(int i=0; i< a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				for(int k=0; k<a[i][j].length; k++)
				{
					System.out.println("Enter the age of school "+i+" class "+j+" student "+k);
					a[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("The ages are");
		for(int i=0; i< a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				for(int k=0; k<a[i][j].length; k++)
				{
					System.out.print(a[i][j][k] );
				}
				System.out.println();
			}
		}
	}


}

