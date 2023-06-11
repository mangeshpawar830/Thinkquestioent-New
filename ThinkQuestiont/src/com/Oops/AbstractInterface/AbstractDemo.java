package com.Oops.AbstractInterface;

//create a one abstract class which contain one abstract method and one concreate
//method create another class which inherit the abstract class & which contain 
//one abstract method inherit this class for one new class which 
//provides implementation to the abstract class
abstract class AbstractDemo {
	
	abstract  void show();
	void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}

}
