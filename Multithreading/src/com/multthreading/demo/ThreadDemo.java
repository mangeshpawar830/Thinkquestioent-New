package com.multthreading.demo;

public class ThreadDemo {
	Thread t1=new Thread() {
		public void run() {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				try {
					Thread.sleep(51);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
		};
		Thread t2=new Thread() {
			public void run() {
				for(char i='a';i<='f';i++) {
					System.out.println(i);
					try {
						Thread.sleep(51);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
			};
			
	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		td.t1.start();
		td.t2.start();
	}
		
	

}
