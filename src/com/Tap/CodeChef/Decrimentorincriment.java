package com.Tap.CodeChef;

import java.util.Scanner;

public class Decrimentorincriment {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		if(N % 4 == 0)
		{
		    System.out.println(++N);
		}
		else
		{
		    System.out.println(--N);
		}
	}
}
