package com.Tap.multitreding;

class Threds extends Thread{

	void typing()  {
		for(int i=0; i<15; i++) {
			System.out.println("Typing....");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

		void codeCompletion() {
			for(; ;) {
				System.out.println("Completed..");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		void saving() {
			for( ; ;) {
				System.out.println("Saving");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		@Override
		public void run() {

			String name = this.getName();

			if(name.equals("Type")) {
				this.typing();
			}
			else if(name.equals("Code")) {
				this.codeCompletion();
			}
			else if(name.equals("Save")) {
				this.saving();
			}

		}
	}

	public class UserDemanTreds {

		public static void main(String[] args) {
			
			System.out.println("Main Started");
			System.out.println("Main Stoped");

			Threds t1 = new Threds();
			Threds t2 = new Threds();
			Threds t3 = new Threds();

			t1.setName("Type");
			t2.setName("Code");
			t3.setName("Save");
			
			t2.setDaemon(true);
			t3.setDaemon(true);

			t1.start();
			t2.start();
			t3.start();

		}

	}
