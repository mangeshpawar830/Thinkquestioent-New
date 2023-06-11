package com.Oops.Containtment;

public class Department {
	private int id;
	private String name;
	private Student student;
	
	
	public Department(int id,String name,Student student) {
		this.id=id;
		this.name=name;
		this.student=student;
	}
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String toString() {
		return "Department(id:"+id+" name:"+name+student;
	}
	public static void main(String[] args) {
		Department department=new Department(1, "CS", new Student(11, "Mangesh"));
		System.out.println(department);
	}

}
