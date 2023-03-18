package com.Tap.Patterns;

public class Patterns {
	static public void main(String...args) {

		int i ,j,num=25;
		/*	for (int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				System.out.print("*");	
			}
			System.out.println();
		}*/


		/*for (i=1; i<=num; i++)
		{
				for(j=1; j<=5; j++)
				{
					if(i==1 || i==num || j==1 || j==num) 
					{
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println();

		}*/


		/*for(i=1; i<=5 ; i++) 
		  {
			for(j=1; j<=5; j++)
			 {
				if(count<10) {
					System.out.print("0");
				}
				System.out.print(count++ +" ");
			}
			System.out.println();
		}*/


		/*for(i=1; i<=5; i++) {
			for(j=1; j<=5; j++) {
				if(i==1 || i==5 || j==1 || j==5) {
					System.out.print(count++ +" ");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println();
			System.out.println();
		}*/


		/*for(i=1; i<=5; i++)
		{
			for(j=1; j<=5; j++)
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}*/


		/*for(i=1; i<=5; i++)
	{
		for(j=1; j<=5; j++)
		{
			 if(i*j<10)
			 {
				 System.out.print("0");
			 }

					System.out.print(i*j +" " );

		}
		System.out.println();
	}*/


		/*for(i=0; i<=5; i++)
		{
			count=i+1;
			for(j=1; j<=5; j++)
			{
				if(count<10)
				{
					System.out.print("0");
				}
				System.out.print(count++ +" ");
			}
			System.out.println();
		}*/
		/*for(i=1; i<=5; i++)
		{
			for(j=1; j<=i; j++) 
			{
				System.out.print("*");	
			}
			System.out.println();
		}
		for(i=1; i<=4; i++)
		{
			for(j=4; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		int k;
		for(i=1; i<=5; i++)
		{
			for(k=1; k<=5-i; k++)
			{
				System.out.print(" ");
			}
			for(j=1; j<=i; j++) 
			{
				System.out.print("*");	
			}
			System.out.println();
		}
		for(i=1; i<=4; i++)
		{
			for(k=1; k<=4-i; k++)
			{
				System.out.print(" ");
			}
			for(j=4; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}*/
		int n=5;
		/*for(i=0; i<n; i++)
		{
			for(j=0; j<=i; j++)
			{
				System.out.print(j+1);
			}
			System.out.println();
		}*/
		
		for(i=1; i<=n; i++)
		{
			int count=i;
			for(j=1; j<=(n-i)+1; j++)
			{
				System.out.print(count++ +" ");
			}
			System.out.println();
		}
	}
}
