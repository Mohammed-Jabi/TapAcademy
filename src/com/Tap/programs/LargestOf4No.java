package com.Tap.programs;

import java.util.Scanner;

public class LargestOf4No {



	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int x1 = scan.nextInt();
		int x2 = scan.nextInt();
		int x3 = scan.nextInt();
		largestOf4No(x,x1,x2,x3);

	}

	static void largestOf4No(int x,int x1,int x2,int x3)
	{
		if(x>=x1 && x1>=x2 && x2>=x3)
		{
			System.out.println(x);
		}
		else if(x1>x && x>=x2 && x>=x3)
		{
			System.out.println(x1);
		}
		else if(x2>x && x>=x1 && x>=x3)
		{
			System.out.println(x2);
		}
		else
		{
			System.out.println(x3);
		}
	}

}
