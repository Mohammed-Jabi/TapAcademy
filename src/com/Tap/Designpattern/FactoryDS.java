package com.Tap.Designpattern;

import java.util.Scanner;

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

	static Customer getCustomer(String choice){

		if(choice.equalsIgnoreCase("gold")) {
			return new GoldCustomer();
		}
		else if(choice.equalsIgnoreCase("silver")) {
			return new Silverustomer();
		}
		else {
			return null;
		}
	}

}

public class FactoryDS {

	public static void main(String[] args) {

		System.out.println("1.GoldCusomer/1.SilverCustomer");
		String choice = new Scanner(System.in).next();	
		
		Customer c = Factory.getCustomer(choice);
		c.addToCart();

	}

}
