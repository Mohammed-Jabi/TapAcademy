package com.Tap.ExceptionHandling;

import java.util.Scanner;

class InvalidUserException extends Exception{
	
	public String getMessage() {
		return "Invalid PAssword. Try Again!";
	}
	
}

class Atm{
	
	private int accNum = 12345;
	private int pin = 2020;
	private int acNo;
	private int pass;
	
	public void accInp() {
		System.out.println("Enter the acNo");
		Scanner scan=new Scanner(System.in);
		int acNo=scan.nextInt();
		System.out.println("Enter the password");
		int pass = scan.nextInt();
	}
	
	public void validate() throws InvalidUserException {
		if(accNum==acNo && pin==pass) {
			System.out.println("Collect your cash :)");
		}
		else {
			InvalidUserException iue=new InvalidUserException();
			System.out.println(iue.getMessage());
			throw iue;
		}
	}
	
}

class Bank{
	
	public void initate() {
		Atm atm = new Atm();
		try {
			atm.accInp();
			atm.validate();
		}
		catch(Exception e){
			try {
				atm.accInp();
				atm.validate();
			}
			catch(Exception f){
				try {
					atm.accInp();
					atm.validate();
				}
				catch(Exception g) {
					System.out.println("Card is block.");
					System.exit(0);
				}
				
			}
		}
	}
	
}

public class CustomException {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.initate();

	}

}
