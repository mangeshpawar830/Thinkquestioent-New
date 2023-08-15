package com.ThreadDemo;


public class AccountSynchronization extends Thread{
	public static void main(String[] args) {

		Account a1 = new Account();
		
		Thread son = new Thread(){
					public void run(){
						try {
							a1.withdraw();
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
				
				son.setName("Son");
				
				Thread father = new Thread(){
					public void run(){	
						try {
							a1.deposite();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
				
				father.setName("Father");
				
				son.start();
				father.start();
	}


}
