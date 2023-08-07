package com.Tap.Designpattern;

class Customer{
	
	void addToCart(){
		System.out.println("Added");
	}
	
}

class GoldCustomer extends Customer{
	
	@Override
	void addToCart() {
	System.out.println("Gold added");
	}
	
}

class Silverustomer extends Customer{
	
	@Override
	void addToCart() {
		System.out.println("Silver added");
	}
	
}

class Factory{
	
	
	
}

public class FactoryDS {

	public static void main(String[] args) {
		
	}

}
