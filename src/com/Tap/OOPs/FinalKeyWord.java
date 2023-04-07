package com.Tap.OOPs;

class Restorent{
	
	final int a=1000;
	
	final void OwnerName() {
		System.out.println("Mohammed Jabir");
	}
	
	void area() {
		System.out.println("RT NAgar");
	}
	
	void capacity() {
		System.out.println(a);
	}
	
	void spacility() {
		System.out.println("Indian");
	}
	
}

class Res1 extends Restorent{
	 
		
		void area() {
			System.out.println("FreserTown");
		}
		
		void capacity() {
			System.out.println(a);
		}
		
		void spacility() {
			System.out.println("Indian & Chines");
		}
}

class Res2 extends Restorent{
	
	void area() {
		System.out.println("ShivajiNagar");
	}
	
	void capacity() {
		System.out.println(a);
	}
	
	
	
}

class Res3 extends Restorent{
	
	void area() {
		System.out.println("FreserTown");
	}
	
	void capacity() {
		System.out.println(a);
	}
	
	void spacility() {
		System.out.println("Indian & Chines");
	}
	
}

class Food{
	
	void permit(Restorent res) {
		res.OwnerName();
		res.area();
		res.capacity(); 
		res.spacility();
		
	}
	
}

public class FinalKeyWord {

	public static void main (String[] args) {
		
	Food f = new Food();
	Res1 r1 = new Res1();
	Res2 r2 = new Res2();
	Res3 r3 = new Res3();
	
	f.permit(r1);
	f.permit(r2);
	f.permit(r3);
		
	}
	
}
