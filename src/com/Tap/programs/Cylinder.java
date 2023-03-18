package com.Tap.programs;

import java.util.Scanner;

public class Cylinder {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int a = scan.nextInt();
		int h = scan.nextInt();
		
		 System.out.println(2*3.142*a*h+2*3.142*a*a);

	}

}
