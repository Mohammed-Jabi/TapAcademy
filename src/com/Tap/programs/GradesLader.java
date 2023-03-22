package com.Tap.programs;

import java.util.Scanner;

public class GradesLader {
	
	static void gradeLader(int x)
	{
		if(x>=90)
		{
			System.out.println("A+");
		}
		else if(x>=80 && x<90)
		{
			System.out.println("A");
		}
		else if(x>=70 && x<80)
		{
			System.out.println("B+");
		}
		else if(x>=60 && x>70)
		{
			System.out.println("B");
		}
		else if(x>=50 && x<60)
		{
			System.out.println("C+");
		}
		else if(x>=40 && x<50)
		{
			System.out.println("C");
		}
		else if(x>=0 && x<40)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid");
		}
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		gradeLader(x);

	}

}
