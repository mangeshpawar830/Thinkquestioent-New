package com.Oops.AbstractInterface;

abstract class A{
	abstract void details();
	public void display() {
		System.out.println("Concreate method");
	}
}

class B extends A{

	void details() {
		System.out.println("Abstract Method..");
	}
	
}

public class AbstractExample2 {
	public static void main(String[] args) {
		A a=new B();
		a.details();
		a.display();
	}

}
