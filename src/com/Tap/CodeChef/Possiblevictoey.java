package com.Tap.CodeChef;

import java.util.Scanner;

public class Possiblevictoey {
	public static void main (String[] args) throws java.lang.Exception
	{
        
       Scanner scan = new Scanner(System.in);
       int r = scan.nextInt();
        int o = scan.nextInt();
        int c = scan.nextInt();
        
        o=20-o;
        c+=o*36;
        if(c>r) 
        {
            System.out.println("YES");
        }
        else 
        {
            
        System.out.print("NO");
        }
    }
}

