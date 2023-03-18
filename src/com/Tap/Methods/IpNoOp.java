package com.Tap.Methods;

public class IpNoOp {
	
	int c;
	
	void add(int a, int b)
	{
		c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		IpNoOp calc=new IpNoOp();
		int Num1=10;
		int Num2=20;
		calc.add(Num1, Num2);
	}

}
