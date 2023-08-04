package com.multthreading.createThread;

public class RunnableInterface implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		RunnableInterface r=new RunnableInterface();
		RunnableInterface r1=new RunnableInterface();
		
		Thread t;
		t=new Thread(r);
		t.start();
		t=new Thread(r1);
		t.start();
		
	}

}
