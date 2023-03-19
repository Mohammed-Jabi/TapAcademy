package com.Tap.programs;

import java.util.Scanner;

public class LastNNo {
	static void laststNNo() {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for(int i=n; i>=1; i--)
		{
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args)
	{
		laststNNo();
	}

}
