package com.fileHandling.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	private int id;
	private String name;
	private float salary;
	private transient int code;
	
	public Employee() {
		super();
	}
	
	
	public Employee(int id, String name, float salary, int code) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.code = code;
	}
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public int getCose() {
		return code;
	}
	public void setCose(int cose) {
		this.code = code;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", code=" + code + "]";
	}
	
	
	

}
