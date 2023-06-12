package com.ArrayOfObject;
//write code to create array of student display all the student & display only thoese
	//student who got a percentage more than 60


public class Student {
	int id;
	String name;
	double percentage;
	
	
	public Student(int id, String name, double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	public String toString() {
		return "id:"+id+" name:"+name+" percentage:"+percentage;
	}






}
