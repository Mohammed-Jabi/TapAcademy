package com.Tap.Methods;

public class IpOp {
	
	int c;
	 
	int add(int a , int b)
	{
		c=a+b;
		return c;
	}

	public static void main(String[] args) {
		
		IpOp calc =new IpOp();
		int num1=10;
		int num2=20;
		int res=calc.add(num1, num2);
		System.out.println(res);
		

	}

}
