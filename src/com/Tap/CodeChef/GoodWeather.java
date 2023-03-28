package com.Tap.CodeChef;

import java.util.Scanner;

public class GoodWeather {
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t!=0){
		    
		    int arr[] = new int[7];
		    int one = 0;
		    int zero = 0;
		    for(int i =0;i<7;i++){
		        arr[i] = s.nextInt();
		        
		    }
		    for(int i = 0;i<7;i++){
		        if(arr[i]==1){
		            one++;
		        }
		        else{
		            zero++;
		        }
		    }
		    
		    
		    if(one>zero){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		    
		    t--;
		}
	}
}
