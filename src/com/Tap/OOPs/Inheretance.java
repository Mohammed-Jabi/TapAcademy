package com.Tap.OOPs;

class Test1{
	
	int a=10;
	int b=20;
	int c=a+b;
	
}

class Test2 extends Test1{
	
	 void call() {
		System.out.println(c);
	}
	
}

public class Inheretance {

	public static void main(String[] args) {
		
		Test2 t = new Test2();
		t.call();

	}

}
