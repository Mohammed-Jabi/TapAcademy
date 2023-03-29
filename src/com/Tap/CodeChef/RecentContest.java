package com.Tap.CodeChef;

import java.util.Scanner;

public class RecentContest {

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i = 1;i <= T;i++)
		{
		    int N = scan.nextInt();
		    int stCount = 0,ltCount = 0;
		    for(int j = 1;j <= N;j++)
		    {
		        String s = scan.next();
		        if(s.equals("START38"))
		        stCount++;
		        if(s.equals("LTIME108"))
		        ltCount++;
		    }
		    System.out.println(stCount+" "+ltCount);
		}
	}
}
