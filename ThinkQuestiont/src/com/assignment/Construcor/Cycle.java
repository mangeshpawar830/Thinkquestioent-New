package com.assignment.Construcor;

public class Cycle {
	int accountNo;
	int noOfWheels;
	
	Cycle(){
		System.out.println("I am default constructor");
	}
	Cycle(int accountNo,int noOfWheels){
	
		System.out.println("I am another construcor");
		
	}
	public static void main(String[] args) {
		Cycle cl=new Cycle();
		Cycle cl1=new Cycle(20,5);
	}

}
