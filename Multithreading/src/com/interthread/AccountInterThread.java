package com.interthread;

class Account {
	int balance = 1000;

	public synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName() + " Wants to Dithdraw: " + amount);
		if ((balance - amount) < 0) {
			System.out.println("---------------------------------------------");
			System.out.println("Insufficient Balance :" + balance);
			System.out.println(Thread.currentThread().getName() + "wiating for deposite");
			System.out.println("----------------------------------------------");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			withdraw(amount);

		} else {
			balance = balance - amount;
			System.out.println("---------------------------------------------");
			System.out
					.println("Withdrad Sucessufull Amount By: " + Thread.currentThread().getName() + " by : " + amount);
			System.out.println("Account Balance Now " + balance);
			System.out.println("-----------------------------------------------");
		}
	}

	public synchronized void deposite(int amount) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("--------------------------------------------------------");
		balance = balance + amount;
		System.out.println(Thread.currentThread().getName() + " has deposited " + amount);

		notifyAll();
		System.out.println("---------------------------------------------------------");
	}
}

public class AccountInterThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a = new Account();

		Thread son = new Thread() {

			public void run() {
				a.withdraw(2500);
			}
		};

		son.setName("Son");

		Thread daughter = new Thread() {

			public void run() {
				a.withdraw(2500);
			}
		};

		daughter.setName("Daughter");

		Thread father = new Thread() {

			public void run() {
				a.deposite(5000);
			}
		};

		father.setName("father");

		Thread mom = new Thread() {

			public void run() {
				a.deposite(3000);
			}
		};

		mom.setName("mom");

		son.start();
		daughter.start();
		father.start();
		mom.start();

	}

}