package com.ArrayOfObject;

import java.util.Arrays;

//create array of student which has id,name,integer type of marks array
	//create array and display it

public class StudentArray {
	int id;
	String name;
	int marks[];
	
	StudentArray(int id,String name,int marks[]){
		this.id=id;
		this.name=name;
		this.marks=marks;
		
	}
	public String toString() {
		return id+" "+name+" "+Arrays.toString(marks);
	}

}
