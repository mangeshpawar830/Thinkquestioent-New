package com.Day5.Oops;

public class Account {
	public long accountNo;
	public String customerName;

	public Account() {
		accountNo=1;
		customerName="mangesh";
		System.out.println("I am in default constructor");
	}
	public Account(int accountNo,String customerName){
		
		System.out.println("I am in paremeterized constructor");
		System.out.println(accountNo);
		System.out.println(customerName);
		
	}
	
	public static void main(String[] args) {
		Account ac=new Account();
		System.out.println(ac.accountNo);
		System.out.println(ac.customerName);
		Account ac1=new Account();
		System.out.println(ac.accountNo);
		System.out.println(ac.customerName);
		Account ac2=new Account(2,"vedha");
		Account ac3=new Account(3,"veda");
		Account ac4=new Account(4,"vetal");
	}

}
