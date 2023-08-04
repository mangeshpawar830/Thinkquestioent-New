package com.multthreading.createThread;

public class ThreadClass extends Thread{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		ThreadClass t1=new ThreadClass();
		ThreadClass t2=new ThreadClass();
		t1.start();
		t2.start();
		
		
	}

}
