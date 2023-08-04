package com.practice;

public class AccountMain implements Account{

	@Override
	public void add(int bal) {
		bal=bal+500;
		System.out.println("new balance: "+bal);
	}
	@Override
	public void offer() {
		System.out.println(balanace);
		
	}
	
	
	/*
	 * public void display() {
	 * 
	 * 
	 * System.out.println("old balance: "+balanace); }
	 */
	
	public static void main(String[] args) {
		AccountMain am=new AccountMain();
		//am.add(balanace);
		am.offer();
		//am.display();
		
		
		
		
	}

}
