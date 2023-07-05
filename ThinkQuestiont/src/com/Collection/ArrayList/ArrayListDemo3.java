package com.Collection.ArrayList;


import java.util.ArrayList;
import java.util.Iterator;

class Employee
{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}

public class ArrayListDemo3 {

	public static void main(String[] args) {
	
		
		ArrayList<Employee1>list=new ArrayList<>();
		
		System.out.println(list);
		
		Iterator<Employee1 >itr=list.iterator();
		while(itr.hasNext())
		{
			Employee1 e=itr.next();
			if(e.salary<50000)
			{
				System.out.println(e);
			}
			//System.out.println(e.id+" "+e.name+" "+e.salary);
		}
		
		System.out.println("....Display employee whos salary less than 50000");
		
		for(Employee1 e:list)
		{
			if(e.salary<50000)
			{
				System.out.println(e);
			}
		}
		
		
		
	}

}

