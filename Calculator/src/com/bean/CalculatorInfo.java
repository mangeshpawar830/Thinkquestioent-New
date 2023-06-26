package com.bean;

public class CalculatorInfo {
	int num1;
	int num2;
	
	public CalculatorInfo(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public String toString() {
		return num1+" "+num2;
	}

}
