package com.Tap.Methods;

public class NoInNoOut {
	
	int a=10;
	int b=20;
	
	void add()
	{
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		NoInNoOut calc=new NoInNoOut();
		calc.add();

	}

}
