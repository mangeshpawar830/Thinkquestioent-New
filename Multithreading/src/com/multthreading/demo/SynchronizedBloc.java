package com.multthreading.demo;

public class SynchronizedBloc {
	public void printTable(int n) {
		System.out.println("Nmae of thread: "+Thread.currentThread().getName());
		
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				System.out.println(n+"*"+i+"="+(n*i));
				try {
					Thread.sleep(400);
				}catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
		System.out.println("Table printed"+n);
	}
	public static void main(String[] args) {
		SynchronizedBloc sb=new SynchronizedBloc();
	}

}
