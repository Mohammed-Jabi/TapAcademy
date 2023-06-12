package com.Tap.multitreding;

class Queue{

	int x;
	boolean isdatapresent = false;
	
		synchronized void store(int j){
			try {
			if(isdatapresent == false) {
				x=j;
				System.out.println("Produced"+x);
				isdatapresent = true;
				notify();
			}
			else {
				wait();
			}

		}
		catch(Exception e) {
			System.out.println("Problem Occered");
		}
	}

	synchronized void retrive() {
		try {
			if(isdatapresent == true) {
				System.out.println("Consumed"+x);
				isdatapresent = false;
				notify();
			}
			else {
				wait();
			}
		}
		catch(Exception e) {
			System.out.println("Problem Occered");
		}
	}

}

class Producer extends Thread{

	Queue a;
	public Producer(Queue q) {
		a=q;
	}

	@Override
	public void run(){
		int i=1;
		for(;;) {
			a.store(i++);
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


}

class Consumer extends Thread{

	Queue b;
	public Consumer(Queue q) {
		b=q;
	}

	@Override
	public void run() {
		for(;;) {
			b.retrive();
			try {
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class ThreadCommunication {

	public static void main(String[] args) {

		Queue q=new Queue();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);

		p.start();
		c.start();

	}

}
