package com.Tap.OOPs;

abstract class Plain{

	abstract void takeOff();
	abstract void fly();
	abstract void land();

}

class CargoPlain extends Plain{

	void takeOff() {
		System.out.println("CArgo plane take off at long runway.");
	}

	void fly() {
		System.out.println("Cargo Plain flys at a low height.");
	}

	void land() {
		System.out.println("Cargo Plain lands on a long run way.");
	}

}

class PasengerPlain extends Plain{

	void takeOff() {
		System.out.println("PasengerPlain  take off at normal runway.");
	}

	void fly() {
		System.out.println("PasengerPlain  flys at a normal height.");
	}

	void land() {
		System.out.println("PasengerPlain  lands on a normal run way.");
	}

}

class FighterPlain extends Plain{

	void takeOff() {
		System.out.println("FighterPlain take off at short runway.");
	}

	void fly() {
		System.out.println("FighterPlain flys at a great height.");
	}

	void land() {
		System.out.println("FighterPlain lands on a short run way.");
	}

}

class Airport1{

	void permit(Plain ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}

}

public class Abstraction {

	public static void main(String[] args) {

		CargoPlain cp = new CargoPlain();
		PasengerPlain pp = new PasengerPlain();
		FighterPlain fp = new FighterPlain();
		Airport1 ap = new Airport1();
		
		ap.permit(cp);
		ap.permit(fp);
		ap.permit(fp);

	}

}
