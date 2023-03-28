package com.Tap.CodeChef;

import java.util.Scanner;

public class KitchenTiming {
	
	
		public static void main (String[] args) throws java.lang.Exception
		{
		 Scanner sc = new Scanner(System.in);
	       int t = sc.nextInt();
	       for (int i = 0; i < t; i++) {
	          int n = sc.nextInt();
	          int [] a = new int [n];
	          int [] b = new int [n];
	          int [] A = new int [n];
	          for(int j =0;j<a.length;j++){
	              a[j] =  sc.nextInt();
	          }
	          for(int j =0;j<b.length;j++){
	              b[j] =  sc.nextInt();
	          }

	           A[0]= a[0];
	           for(int j =1;j<A.length;j++){
	               A[j] =  a[j]-a[j-1];
	           }
	           int count =0;
	           for(int j =0;j<n;j++){
	               if(A[j]>=b[j]){
	                   count++;
	               }else{
	                   continue;
	               }
	           }
	           System.out.println(count);


	       }
		}
	}
