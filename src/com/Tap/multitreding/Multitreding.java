package com.Tap.multitreding;

import java.util.Scanner;

class PrintNumbers implements Runnable{

	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

class PrintAlphabets implements Runnable {

	@Override
	public void run() {
		
		for(char i='A'; i<='Z'; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
		
	}
	
}

class Addition implements Runnable{

	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		int a=scan.nextInt();
		System.out.println("Enter the valu of b :");
		int b=scan.nextInt();
		System.out.println("Result :" + (a+b));
	}

	
}

public class Multitreding {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main Started");

		
		PrintNumbers p1=new PrintNumbers();
		PrintAlphabets p2 =new PrintAlphabets();
		Addition a1=new Addition();
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(a1);
		
		t1.start();
		t2.start();
		t3.start();
		
		t3.join();
		t2.join();
		t1.join();

		System.out.println("Main Stoped");
	}

}
 