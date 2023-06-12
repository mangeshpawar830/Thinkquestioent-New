package com.ArrayOfObject;

import java.util.Scanner;

public class DeptMain {
	public static void main(String[] args) {
		Department department[]=new Department[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<department.length;i++) {
			System.out.print("Enter the department id: ");
			int deptId=sc.nextInt();
			System.out.print("Enter the department name: ");
			String deptName=sc.next();
			System.out.print("Enter employee id: ");
			int empId=sc.nextInt();
			System.out.print("Enter the employee name: ");
			String empName=sc.next();
			System.out.print("Enter the employee salary: ");
			int empSalary=sc.nextInt();
			
			department[i]=new Department(deptId,deptName,new Employee(empId,empName,empSalary));
			
		}
		System.out.println("-------Display all the details-----------");
		for(int i=0;i<department.length;i++) {
			System.out.println(department[i]);
		}
		System.out.println("----salary more than 30000----");
		for(int i=0;i<department.length;i++) {
			if(department[i].emp.empSalary>30000)
				System.out.println(department[i]);
		}
		
	}

}
