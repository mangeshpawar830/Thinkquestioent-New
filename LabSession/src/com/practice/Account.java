package com.practice;

public interface Account {
	int balanace=1000;
	
	void add(int balanace);
	
	default void offer() {
		display();
		System.out.println("offer..");
	}
	private void display() {
		System.out.println(balanace);
	}
	
	/*
	 * default void display() {
	 * 
	 * System.out.println("balance: "+balanace);
	 * 
	 * }
	 */
	/*
	 * static void offer() { System.out.println("offer....");
	 * 
	 * }
	 */
	

}
