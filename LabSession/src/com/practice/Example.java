package com.practice;

abstract class Student{
	int id;
	String name;
	int marks;
	
	public Student(int id,String name,int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
		
	}
	abstract void display();
	
}

public class Example extends Student{
	
	
	public Example(int id, String name, int marks) {
		super(id, name, marks);
		display();
	}

	@Override
	public void display() {
		System.out.println(id+ " "+name+" "+marks);
		
	}
	public static void main(String[] args) {
		Example e=new Example(1, "mangesh", 22);
	}

	
}
