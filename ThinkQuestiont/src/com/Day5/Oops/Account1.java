package com.Day5.Oops;

public class Account1 {
	//write getter setter fort the bank account class account has accNo,accType,
	//custNmae,accbalance.
	private int accountNo;
	private String accountType;
	private String custName;
	private long accBalance;
	
	public void setAccountNo(int accNo) {
		this.accountNo=accNo;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountType(String accType) {
		this.accountType=accType;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setCustName(String custoName) {
		this.custName=custoName;
	}
	public String getCustName() {
		return custName;
	}
	public void setAccBalance(long accbal) {
		this.accBalance=accbal;
	}
	public long getAccBalance() {
		return accBalance;
	}

}
