package com.ThreadDemo;

import java.util.Scanner;

public class Account {
	int balance = 1000;
	

	public synchronized void withdraw() throws InterruptedException{		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Balance Before withdraw "+balance);
	
			Thread.sleep(1500);
	
			System.out.println("Enter the Withdraw Amount");
			int withdraw = sc.nextInt();
	
			if(withdraw > balance)
			{
				wait();
			}
	
			Thread.sleep(1000);
	
			balance = balance - withdraw;
	
			Thread.sleep(1000);
	
			System.out.println("Updated Balance is : "+balance);
}

	public synchronized void deposite() throws InterruptedException{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Balance Before Deposite "+balance);
	
		Thread.sleep(1500);
	
		System.out.println("Enter the Deposite Amount");
		int deposite = sc.nextInt();
	
		Thread.sleep(1000);
	
		balance = balance + deposite;
	
		Thread.sleep(1000);
	
	
	
		System.out.println("Updated Balance is : "+balance);

	}
}
