package com.Collection.ComparableComparator;

import java.util.Comparator;

public class Employee {
	int id;
	String name;
	int salary;
	String department;
	public Employee(int id, String name, int salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}
	
}
class IdCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.id-o2.id;
	}
	
}
class NameCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name);
	}
}
class SalaryCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.salary-o2.salary;
	}
}
class DepartmentCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.department.compareTo(o2.department);
	}
	
}
