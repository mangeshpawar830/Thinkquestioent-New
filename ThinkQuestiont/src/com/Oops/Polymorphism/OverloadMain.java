package com.Oops.Polymorphism;

public class OverloadMain {
	
	public static void main(int a,int b) {
		int add=a+b;
		System.out.println(add);
	}
	public static void main(int a,double b) {
		double sub=a*b;
		System.out.println(sub);
	}
	public static void main(String[] args) {
		main(5, 4.5);
		main(5, 6);
		
		
	}

}
