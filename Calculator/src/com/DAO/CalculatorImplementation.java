package com.DAO;

public class CalculatorImplementation implements CalculatorDetails{

	@Override
	public int add(int num1, int num2) {
		int add=num1+num2;
		return add;
	}

	@Override
	public int sub(int num1, int num2) {
		int sub=num1-num2;
		return sub;
	}

	@Override
	public int mul(int num1, int num2) {
		int mul=num1*num2;
		return mul;
	}

	@Override
	public int div(int num1, int num2) {
		int div=num1/num2;
		return div;
	}

	
}
