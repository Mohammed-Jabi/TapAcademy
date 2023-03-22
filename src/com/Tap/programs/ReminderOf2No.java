package com.Tap.programs;

import java.util.Scanner;

public class ReminderOf2No {

	int res;
	static void reminderOfNo(int n,int n1)
	{
		if(n>n1)
		{
			System.out.println(n%n1);
			//return res;
		}
		else {
			System.out.println("-1");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		reminderOfNo(x,y);
		

	}

}
