package com.khadijaMam;

public class AccountMain {
	    public static void main(String[] args) {
	        Account myAccount = new Account();

	        // Insert account data
	        myAccount.insert("123456789", "Mangesh");

	        // Display account information
	        myAccount.display();

	        // Deposit amount
	        myAccount.deposit(1000);

	        // Withdraw amount
	        myAccount.withdraw(500);

	        // Check balance
	        myAccount.checkBalance();
	    }
	


}
