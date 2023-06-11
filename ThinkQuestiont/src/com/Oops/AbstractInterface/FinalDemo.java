package com.Oops.AbstractInterface;

public class FinalDemo {
	
	final void add(int a,int b) {
		int c=a+b;
		System.out.println("Addition: "+c);
	}
	final void add(int a,int b,int c) {
		int d=a+b+c;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		FinalDemo fd=new FinalDemo();
		fd.add(5, 6);
		fd.add(5, 6, 7);
	}

}
