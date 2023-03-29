package com.Tap.CodeChef;

import java.util.Scanner;

public class CheepCab {

	public static void main (String[] args) throws java.lang.Exception
{
	Scanner sc = new Scanner(System.in);
	
	int T = sc.nextInt();
	for (int i =1;i<=T ;i++ ){
	    
	    int X = sc.nextInt();
	    int Y = sc.nextInt();
	    if(X<Y){
	        System.out.println("FIRST");
	    }
	    else if(Y<X){
	        System.out.println("SECOND");
	    
	    }
	    else{
	        System.out.println("ANY");
	    }
	} 
}
}
