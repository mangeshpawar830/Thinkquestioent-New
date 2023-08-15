package com.multthreading.demo;

public class SynchronizedTable {
	public synchronized void  printTable(int n) {
		for(int i=1;i<=10;i++) {
			
			System.out.println(n+"*"+i+"="+(n*i));
		}
		
	}
	public static void main(String[] args) {
		SynchronizedTable st=new SynchronizedTable();
		Thread t1=new Thread() {
			public void run() {
				st.printTable(5);
			}
		};
		Thread t2=new Thread() {
			public void run() {
				st.printTable(6);
			}
		};
		Thread t3=new Thread() {
			public void run() {
				st.printTable(7);
			}
		};
		t1.start();
		t2.start();
		t3.start();
	}

}
