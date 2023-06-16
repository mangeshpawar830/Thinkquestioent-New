package com.khadijaMam;

public class Student {
	int id;
	String name;
	int marks[];
	double percentage;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public double getPercentage() {
		return percentage;
	}

	
	public void calPercentage() {
		int sum=0;
		for(int i=0;i<marks.length;i++) {
			sum=sum+marks[i];
			percentage=(sum*3)/100.0;
		}
		
	}
	

}
