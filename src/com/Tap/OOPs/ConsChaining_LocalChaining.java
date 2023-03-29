package com.Tap.OOPs;

class Examp1{
	
	int x,y;
	
	Examp1(){
		x=100;
		y=200;
	}
	Examp1(int x, int y){
		this.x=x;
		this.y=y;
	}
}

class Examp2 extends Examp1{

	int a,b;
	
	Examp2(){
		
		a=1000;
		b=2000;
	}
	Examp2(int a, int b){
		super(30,40);
		this.a=a;
		this.b=b;
	}
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}
}

public class ConsChaining_LocalChaining {
	
	public static void main(String args[] ) {
		
	Examp2	ex = new Examp2(10,20);
	ex.display();
		
	}

}
