package com.Tap.ExceptionHandling;

import java.util.Scanner;

class Demo1{
	void fun1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inside fun1");
		
			System.out.println("Enter the Numerator");
			int a = scan.nextInt();
			System.out.println("Enter the Denominator");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println(c);
		
		

		System.out.println("Inside Demo4 fun4");
	}
}

class Demo2{
	
	void fun2(){
		Demo1 d1= new Demo1();
		d1.fun1();
		System.out.println("Inside Demo4 fun4");
	}
}

class Demo3{
	
	void fun3() {
		Demo2 d2 = new Demo2();
		d2.fun2();
		System.out.println("Inside Demo4 fun4");
	}
}

class Demo4{
	
	void fun4(){
		Demo3 d3 = new Demo3();
		d3.fun3();
		System.out.println("Inside Demo4 fun4");
	}
	
}

public class SingleTryCatchForMulClasses {

public static void main (String[] args){
	System.out.println("");
	try {
		Demo4 d4 = new Demo4();                                //Incomplete Program
		d4.fun4();
	}
	
	catch(Exception e) {
		System.out.println("Divide by zero erroe");
	}
		
	}

}

