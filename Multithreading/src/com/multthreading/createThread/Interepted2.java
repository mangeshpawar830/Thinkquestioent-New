package com.multthreading.createThread;

public class Interepted2 {
	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					
					if(Thread.interrupted())
					{
						System.out.println("Interrpt :"+i);
					
				
					try {
						Thread.sleep(2500);
					} catch (InterruptedException e) {
						System.out.println(e);
					}
					}
					else
					{
						System.out.println("Normal :"+i);
					}
				}
			}
		};
		
	Thread t2 = new Thread() {
			public void run() {
				//t.interrupt();
				for (int i = 11; i <= 15; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println(e);
					}
				}
			}
		};
		
		
		Thread t3 = new Thread() {
			public void run() {
				for (int i = 21; i <= 25; i++) {
					System.out.println(i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						System.out.println(e);
					}
				}
			}
		};
		
		t.start();
		t.interrupt();
		t2.start();
		t3.start();

	
	}

}
