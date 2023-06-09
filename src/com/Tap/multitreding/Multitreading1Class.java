package com.Tap.multitreding;

import java.util.Scanner;

class Multitereded extends Thread {
	
	void addition() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a=scan.nextInt();
		System.out.println("Enter the valu of b :");
		int b=scan.nextInt();
		System.out.println("Result :" + (a+b));
	}
	
	void printNumbers() {
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	void printAlphabets() {
		for(char i='A'; i<='Z'; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		
		String name = this.getName();
		
		if(name.equals("Add")) {
			this.addition();
		}
		else if(name.equals("Num")) {
			this.printAlphabets();
		}
		else if(name.equals("Char")) {
			this.printNumbers();
		}
		
	}
	
}

public class Multitreading1Class {

	public static void main(String[] args) {
		
		Multitereded t1= new Multitereded();
		Multitereded t2= new Multitereded();
		Multitereded t3= new Multitereded();
		
		t1.setName("Add");
		t2.setName("Num");
		t3.setName("Char");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
