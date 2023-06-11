 package com.Tap.multitreding;
 
 class Customer{
	 synchronized void withdraw(String mode) {
		for(int i=0; i<=10; i++) {
			System.out.println("Withdraw through"+mode);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
 }
 
 class Bank extends Thread{
	 
	 Customer c;
	 String mode;
	 
	 public Bank(Customer c, String mode) {
		 this.c=c;
		 this.mode=mode;
	 }
	 
	@Override
		public void run() {
		c.withdraw(mode);
	}

	 
 }

public class MultiterdingBank {

	public static void main(String[] args) {
		
		Customer alex = new Customer();
		
	Bank t1 =	new Bank(alex,"PhonePe");
	Bank t2 =	new Bank(alex,"Paytm");
	Bank t3 =	new Bank(alex,"G-Pay");
	
	t1.start();
	t2.start();
	t3.start();

	}

}
