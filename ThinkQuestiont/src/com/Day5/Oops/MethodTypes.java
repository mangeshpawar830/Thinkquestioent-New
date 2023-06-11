package com.Day5.Oops;

public class MethodTypes {
	
	//No Return type No parameter
	public void display() {
		System.out.println("This is display method..");
	}
	
	//No Return type With parameter
	public void addition(int a,int b) {
		System.out.println("Addition :"+(a+b));
	}
	//Return type With No parameter
	public int show() {
		int abc=56;
		return abc;
	}
	//Return type With parameter
	public int operation(int a,int c) {
		int mul=a*c;
		return mul;
		
	}

	
	public static void main(String[] args) {
		MethodTypes mt=new MethodTypes();
		mt.display();
		mt.addition(5, 6);
		System.out.println(mt.show());
		int mul=mt.operation(4, 6);
		System.out.println(mul);
		
		
	}

}
