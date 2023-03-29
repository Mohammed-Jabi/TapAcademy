package com.Tap.OOPs;

class Account{

	private int AccountNo;
	private int PassWord;

	public  Account() {
		System.out.println("Example of Super constructor");
//		this.AccountNo=AccountNo;
//		this.PassWord=PassWord;

	}
	public int getAccountNo() {

		return AccountNo;

	}
	public int getPassWord() {

		return PassWord;
	}
}

class Hacker extends Account{

	public Hacker() {
		//super();-------------Constructor chaining
		System.out.println("Hacker");

	}

}

public class SupreInInheretance {

	public static void main(String[] args) {

		Hacker h	= new Hacker();
		//ac.Hacker();	

	}

}
