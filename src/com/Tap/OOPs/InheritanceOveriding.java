package com.Tap.OOPs;

class Paresnts{
	
	void height() {
		System.out.println("Tall");
	}
	void skinColor() {
		System.out.println("Fair");
	}
	void hairColor() {
		System.out.println("Black");
	}
	void nose() {
		System.out.println("Sharp");
	}
}

class Child1 extends Paresnts{
	
	void hairColor(){
		System.out.println("Blond");
	}
	
}

class Child2 extends Paresnts{
	
	void hairColor() {
		System.out.println("Broun");
	}
	
}

public class InheritanceOveriding {

	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		

	}

}
