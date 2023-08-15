package com.multthreading.createThread;

public class JoinMethod3 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread() {
			public void run() {
				System.out.println("submit document..");
				}
			
		};
		Thread t2=new Thread() {
			public void run() {
				System.out.println("verify..");
				
			}
			
		};
		Thread t3=new Thread() {
			public void run() {
				System.out.println("renew..");
			}
		};
		t1.start();
		t1.join();
		t1.sleep(2000);
		t2.start();
		t2.sleep(3000);
		t3.start();
	}

}
