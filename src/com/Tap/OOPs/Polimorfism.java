package com.Tap.OOPs;

class Plane{
	
	void takeOff() {
		System.out.println("Plain will takeOff to fly");
	}
	
	void fly(){
		System.out.println("Plain will fly ");
	}
	
	void carry() {
		System.out.println("Plain carrys .....");
	}
	
}

class CargoPlane extends Plane{
	
	void takeOff() {
		System.out.println("CargoPlain will takeOff in long run way");
	}
	
	void fly(){
		System.out.println("CargoPlain will fly at low height ");
	}
	
	void carry() {
		System.out.println("CargoPlain will carrys goods");
	}
	
}

class PasengerPlane extends Plane{
	
	void takeOff() {
		System.out.println("PasengerPlain will takeOff in normal run way");
	}
	
	void fly(){
		System.out.println("PasengerPlain will fly at medium height ");
	}
	
	void carry() {
		System.out.println("PasengerPlain will carrys pasenger");
	}
	
}

class FighterPlane extends Plane{
	
	void takeOff() {
		System.out.println("FighterPlain will takeOff in short run way");
	}
	
	void fly(){
		System.out.println("FighterPlain will fly at great height ");
	}
	
	void carry() {
		System.out.println("FighterPlain will carrys wepens");
	}
	
}

class Airport{
	
	void permit(Plane ref) {
		
		ref.takeOff();
		ref.fly();
		ref.carry();
		
	}
	
}


public class Polimorfism {

	public static void main(String[] args) {
		
		CargoPlane cp=new CargoPlane();
		PasengerPlane pp = new PasengerPlane();
		FighterPlane fp = new FighterPlane();
		Airport ap = new Airport();
		
		ap.permit(cp);
		ap.permit(pp);
		ap.permit(fp);

	}

}
