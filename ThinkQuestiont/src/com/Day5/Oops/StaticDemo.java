package com.Day5.Oops;

public class StaticDemo {
	static int num1;
	int num2;
	int add;
	
	
	static void add(int num2,int add) {
		StaticDemo sd=new StaticDemo();
		add=num1+num2;
		sd.display();
		
	}
	public void display() {
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(add);
	}
	public static void main(String[] args) {
		add(10, 20);
		
	}

}
