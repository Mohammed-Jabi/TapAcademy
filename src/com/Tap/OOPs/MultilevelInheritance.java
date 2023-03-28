package com.Tap.OOPs;

class Class{
	
	int a=10;
	int b=20;
	//int c=a+b;
	void call3() {
		System.out.println("Mohammed");
	}
	
	
}

class Class2 extends Class{
	
	int c=a+b;
	void call2() {
		System.out.println("Jabir");
	}
	
	
}

class Class3 extends Class2{

	void call() {
		System.out.println(c);
	}
	void call1() {
		System.out.println("Engineer");
	}
	
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		
//		Test1 t1 = new Test1();
//		Test2 t2 = new Test2();
		Class3 t = new Class3();
		t.call3();
		t.call2();
		t.call1();
		

	}

}
