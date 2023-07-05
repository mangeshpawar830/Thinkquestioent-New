package com.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee1Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee1>al=new ArrayList<>();
		System.out.print("Enter the no. of employee: ");
		int emp=sc.nextInt();
		for(int i=0;i<emp;i++) {
			System.out.print("Enter the employee id: ");
			int id=sc.nextInt();
			System.out.print("Enter the employee name: ");
			String name=sc.next();
			System.out.print("Enter the employee salary: ");
			int salary=sc.nextInt();
			
			Employee1 em=new Employee1();
			em.setId(id);
			em.setName(name);
			em.setSalary(salary);
			al.add(em);

		}
		System.out.println("------------");
		for(Employee1 em1:al) {
			System.out.println(em1.getId()+" "+em1.getName()+" "+em1.getSalary());
		}
		System.out.println("------Highest Salary------");
		int maxSalary=0;
		String highestPaid=null;
		int count=0;
		int arr[]=new int[5];
		String str[]=new String[5];
		
		for(Employee1 em1:al) {
			if(em1.getSalary()>=maxSalary) {
				maxSalary=em1.getSalary();
				arr[count]=maxSalary;
				highestPaid=em1.getName();
				str[count]=highestPaid;
				count++;
			}
			
		}
		
		for(int i=0;i<count;i++) {
		
			System.out.println(arr[i]+" "+str[i]);
		}
			
		}
		

}
