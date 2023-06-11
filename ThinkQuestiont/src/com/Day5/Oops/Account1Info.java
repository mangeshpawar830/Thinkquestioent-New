package com.Day5.Oops;

public class Account1Info {
	public static void main(String[] args) {
		Account1 at1=new Account1();
	at1.setAccountNo(54545455);
	at1.setAccountType("Saving");
	at1.setCustName("Mangesh Pawar");
	at1.setAccBalance(656566323);
	System.out.println("Account No:"+at1.getAccountNo());
	System.out.println("Account type:"+at1.getAccountType());
	System.out.println("Customer Name:"+at1.getCustName());
	System.out.println("Account Balance:"+at1.getAccBalance());

		
	}

}
