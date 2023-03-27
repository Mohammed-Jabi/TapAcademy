package com.Tap.CodeChef;

import java.util.Scanner;

class SecondMaxNo {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
	for(int i=0;i<T;i++)
		{
		    int A=scan.nextInt();
		    int B=scan.nextInt();
		    int C=scan.nextInt();
		    if(A>=B && A<C ||A>=C && A<B)
		    {
		        System.out.println(A);
		    }
		    if(B>=C && B<A ||B>=A && B<C)
		    {
		        System.out.println(B);
		    }
		    if(C>=B && C<A || C>=A && C<B)
		    {
		        System.out.println(C);
		    }
		}
	}
}

