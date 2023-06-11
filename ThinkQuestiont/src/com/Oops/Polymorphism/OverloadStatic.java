package com.Oops.Polymorphism;

public class OverloadStatic {
	
	static void calculate(int a,int b) {
		int add=a+b;
		System.out.println("Addition is: "+add);
	}
	static void calculate(int a, double b) {
		int sub= (int)(a-b);
		System.out.println("Substraction is: "+sub);
	}
	static void calculate(double a,int b,int c) {
		int mul=(int) (a*b*c);
		System.out.println("Multiplication is: "+mul);
	}
	static void calculate(double a,double b) {
		double div=a/b;
		System.out.println("Dividation: "+div);
	}
	public static void main(String[] args) {
		calculate(6,5);
		calculate(6,2.4);
		calculate(2,3,4);
		calculate(2.1,1.2);
	}

}
