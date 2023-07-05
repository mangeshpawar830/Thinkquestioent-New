package com.Collection.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee>emp=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of employee: ");
		int noofemployee=sc.nextInt();
		for(int i=0;i<noofemployee;i++) {
			System.out.print("Enter the employee id: ");
			int id=sc.nextInt();
			System.out.print("Enter the employee name: ");
			String name=sc.next();
			System.out.print("Enter the employee salary: ");
			int salary=sc.nextInt();
			System.out.print("Enter the employee department name: ");
			String department=sc.next();
			emp.add(new Employee(id, name, salary, department));
		}
		System.out.println("------------");
		for(Employee em:emp) {
			System.out.println(em);
		}
		Collections.sort(emp,new IdCompare());
		Collections.sort(emp,new NameCompare());
		Collections.sort(emp,new SalaryCompare());
		Collections.sort(emp,new DepartmentCompare());
		System.out.println("------------");
		for(Employee em:emp) {
			System.out.println(em);
		}
		

	}

}
