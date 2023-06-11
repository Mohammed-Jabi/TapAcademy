package com.Tap.Designpattern;

class Alpha{
	
	static Alpha alpha;
	
	private Alpha() {
		
	}
	//for multitreded program
	synchronized public static Alpha getAlpha(){
		if(alpha==null) {
			alpha = new Alpha();
		}
		return alpha;
	}
	
}

public class SingleToneDS {

	public static void main(String[] args) {
	
	Alpha a1 =	Alpha.getAlpha();
	Alpha a2 =	Alpha.getAlpha();
	
	System.out.println(a1);
	System.out.println(a2);
	}

}
