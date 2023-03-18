package com.Tap.Looping;

public class Loop {
	
	public static void main(String [] args) {
		
		/*for(int i=1; i<=7; i++)
		{
			System.out.println("Welcome ");
		}
		
		int i=1;
		while(i<=7) {
			System.out.println("To");
			i++;
		}
		
		int j=1;
		do {
			System.out.println("Looping program");
			j++;
		}while(j<=7);
		
		/*for(int i=1; i<=0; i++)
		{
			System.out.println("Welcome ");
		}
		
		int i=1;
		while(i<=0) {
			System.out.println("To");
			i++;
		}
		
		int j=1;
		do {
			System.out.println("Looping program");
			j++;
		}while(j<=0);*/
		
		/*int i,sum;
		for(i=1, sum=0; i<=7; i++, sum+=i)
		{
			System.out.println(i);
			
		}
		System.out.println(sum);*/
		int i,j;
		for(i=1, j=7; i<=7 && j>0; i++, j--)
		{
			System.out.println("i=" +i+ " j=" +j);
		}
	}

}
