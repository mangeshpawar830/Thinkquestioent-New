package com.Oops.AbstractInterface;

public class AbstractDemo1 extends AbstractDemo{

	
	void show() {
		System.out.println("This is inherited method..");
	}
	
	public static void main(String[] args) {
		AbstractDemo ad=new AbstractDemo1();
		ad.add();
		ad.show();
		
	
	}

}
