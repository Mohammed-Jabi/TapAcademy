package com.Tap.CodeChef;

import java.util.Scanner;

public class FootBall {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			if((x>=1||y>=1) && x==y){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}
