package com.Oops.Polymorphism;

public class OverrideOverload1 extends OverrideOverload{
	

	
	@Override
	public void show() {
		System.out.println("show method ");
	}
	@Override
	public void show(int a,int b) {
		int add=a+b;
		System.out.println("show method 1 st"+add);
	}
	public static void main(String[] args) {
		OverrideOverload oo=new OverrideOverload1();
		oo.show();
	}

}
