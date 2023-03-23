package com.Tap.OOPs;

import java.util.Scanner;

class Bank{
	private float bal;
	
	public void setData(float x) {
		if(x>0) {
			bal = x;
		}
	}
	public float getData() {
		return bal;
	}
}
//Error
class Encapsulation{
	public static void main(String args[]) {
		
		Bank ba = new Bank();
		Scanner scan = new Scanner(System.in);
		float x = scan.nextFloat();
		ba.setData(x);
		System.out.println(ba.getData());
	}
}
