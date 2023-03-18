package com.Tap.Methods;

import java.util.Scanner;

public class NoIpOp {
	
	int a=10;
	int b=20;
	int add()
	{
	Scanner	scan=new Scanner(System.in);
	int c= a+b;
	return c;
	}
	
	public static void main(String[] args)
	{
		NoIpOp calc=new NoIpOp();
		int res=calc.add();
		System.out.println(res);
	}

}
