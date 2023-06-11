package com.Day5.Oops;

import java.util.Scanner;

public class Paytm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Customer cm=new Customer();
		cm.setId(1);
		cm.setName("mangesh");
		System.out.print("Enter the amount: ");
		int amount=sc.nextInt();
		
		int totalAmount=cm.getBalance();
		int remainingAmount=totalAmount-amount;
		cm.setBalance(remainingAmount);
		
		System.out.println("id:"+cm.getId()+" name:"+cm.getName()+" balance:"+cm.getBalance());
		
		
	}

}
