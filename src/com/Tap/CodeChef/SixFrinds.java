package com.Tap.CodeChef;

import java.util.Scanner;

class SixFrinds {

		public static void main (String[] args) throws java.lang.Exception
		{
			Scanner s = new Scanner(System.in);
			int t = s.nextInt();
			for(int i=0;i<t;i++){
			    int a = s.nextInt();
			    int b = s.nextInt();
			    if(a*3>=b*2){
			        System.out.println(b*2);
			    }
			    else{
			        System.out.println(a*3);
			    }
			}
		}
	}

