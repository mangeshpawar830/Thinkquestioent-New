package com.multthreading.demo;

public class SleepDemo extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"Thread Started..");
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"stop..");
		
	}
	
	public static void main(String[] args) {
		SleepDemo sd=new SleepDemo();
		SleepDemo sd1=new SleepDemo();
		sd.setName("first: ");
		sd1.setName("second: ");

		sd.start();
		sd1.start();
	}

}
