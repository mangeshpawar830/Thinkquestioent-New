package com.multthreading.demo;

class YieldMethodTest extends Thread {
	   public void run() {
	      for (int i = 0; i < 5; i++) {
	         Thread.yield(); 
	         System.out.println("Thread started:" + Thread.currentThread().getName());
	      }
	      System.out.println("Thread ended:" + Thread.currentThread().getName());
	   }
	}
	public class MyThread {
	   public static void main(String[] args) {
		   YieldMethodTest thread = new YieldMethodTest();
		   thread.setPriority(8);
	      thread.start();
	      for (int i = 0; i < 5; i++) {
	         System.out.println("Thread started:" + Thread.currentThread().getName());
	      }
	      System.out.println("Thread ended:" + Thread.currentThread().getName());
	   }
	}
