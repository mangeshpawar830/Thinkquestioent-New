package com.multthreading.createThread;

public class ThreadPriority extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" : "+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		Thread t1=new Thread();
		t1.setName("My Thread 1");
		t1.setPriority(1);
		
		Thread t2=new Thread();
		t2.setName("My Thread 2");
		t2.setPriority(6);
		
		Thread t3=new Thread();
		t3.setName("My Thread 3");
		t3.setPriority(4);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
