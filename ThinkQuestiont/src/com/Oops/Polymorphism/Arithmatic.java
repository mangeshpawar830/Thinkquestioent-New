package com.Oops.Polymorphism;

public class Arithmatic {
	
	public void calculate(int a,int b) {
		int add=a+b;
		System.out.println("Addition is: "+add);
	}
	public void calculate(int a, double b) {
		int sub= (int)(a-b);
		System.out.println("Substraction is: "+sub);
	}
	public void calculate(double a,int b,int c) {
		int mul=(int) (a*b*c);
		System.out.println("Multiplication is: "+mul);
	}
	public void calculate(double a,double b) {
		double div=a/b;
		System.out.println("Dividation: "+div);
	}
	
	public static void main(String[] args) {
		Arithmatic ac=new Arithmatic();
		ac.calculate(5, 6);
		ac.calculate(5, 2.3);
		ac.calculate(5, 6, 4);
		ac.calculate(2.3, 6);
		
	}

}
