package com.ArrayOfObject;

public class Employee {
	int empId;
	String empName;
	int empSalary;
	
	public Employee(int empId,String empName,int empSalary) {
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	public String toString() {
		return empId+" "+empName+" "+empSalary;
	}

}
