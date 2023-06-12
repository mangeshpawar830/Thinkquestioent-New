package com.ArrayOfObject;

//write code to create array of department,department has dep_id,dep_name and employee type
	//of object employee has emp_id,emp_name,emp_salary create array and display it
	//display all the employee who got salary more than 30000.

public class Department {
	int deptId;
	String deptName;
	Employee emp;
	
	public Department(int deptId,String deptName,Employee emp) {
		this.deptId=deptId;
		this.deptName=deptName;
		this.emp=emp;
	}
	public String toString() {
		return deptId+" "+deptName+" "+emp;
	}

}
