package com.ArrayOfObject;

//write code to create array of car car has model_no,name,price display cars which
//price in betn 1 lakh to 7 lakh

public class Car {
	int modelNo;
	String modelName;
	long price;
	
	public Car(int modelNo,String modelName,long price) {
		this.modelNo=modelNo;
		this.modelName=modelName;
		this.price=price;
	}
	public String toString() {
		return "Model No:"+modelNo+" model Name:"+modelName+" model Price:"+price;
	}

}
