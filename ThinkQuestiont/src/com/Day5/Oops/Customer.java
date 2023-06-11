package com.Day5.Oops;

public class Customer {
	private int id;
	private String name;
	private int balance=10000;
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	
	
}
