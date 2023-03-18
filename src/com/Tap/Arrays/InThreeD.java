package com.Tap.Arrays;

import java.util.Scanner;

public class InThreeD {
	public static void main(String[] args)
	{

		Scanner scan=new Scanner(System.in);

		int[][][] a= {{{10,20,30,40},{50,70,80},{90,100}},{{110,120,130},{140,150,160}}};


		System.out.println("The ages are");
		
		for(int i=0; i< a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				for(int k=0; k<a[i][j].length; k++)
				{
					System.out.print(a[i][j][k]+" " );
				}
				System.out.println();
			}
		}
	}


}
