package com.Tap.OOPs;

class Paresnts1{
	
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

class Ch1 extends Paresnts{
	
	void hairColor(){
		System.out.println("Blond");
	}
	void swim() {
		System.out.println("Ch1 can swim");
	}
	
}

class Ch2 extends Paresnts{
	
	void hairColor() {
		System.out.println("Broun");
	}
	void horseRide(){
		System.out.println("Ch2 can ride a horse");
	}
	
}
public class InheretanceSpecilised {

	public static void main(String[] args) {

		Ch1 c1 = new Ch1();
		Ch2 c2 = new Ch2();
		Paresnts1 p = new Paresnts1();
		
		c1.swim();
		c2.horseRide();
		
	}

}
