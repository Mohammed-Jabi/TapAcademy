package com.Tap.CodeChef;

import java.util.Scanner;

class LunchTime {

	class Codechef
	{
		public static void main (String[] args) throws java.lang.Exception
		{
			// your code goes here
			Scanner sc=new Scanner(System.in);
			int t=sc.nextInt();
			for(int i=1;i<=t;i++){
			 int n=sc.nextInt();
			 if(n>=1&&n<=4)
			 System.out.println("yes");
			 else
			 System.out.println("no");
			}
		}
	}
}