package com.Collection.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

/*create a list is of employee type it contain id,name,salary increase
the salary by 10% of thoes employee who salary is less than 20000.*/

class Employee2{
	int id;
	String name;
	long salary;
	
	public Employee2(int id, String name, long salary) {
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

public class Employee2Main {
	public static void main(String[] args) {
		ArrayList<Employee2>al2=new ArrayList<>();
		al2.add(new Employee2(101, "jay", 40000));
		al2.add(new Employee2(102, "mangesh",10000));
		al2.add(new Employee2(103, "vedang", 35000));
		al2.add(new Employee2(104, "vedant", 15000));
		al2.add(new Employee2(105, "surve", 45000));
		al2.add(new Employee2(106, "rushi", 9000));
		
		for(Employee2 emp:al2) {
			if(emp.salary<20000)
			emp.salary=(long) (emp.salary+emp.salary*0.10);
		}
		System.out.println(al2);
		

	}
	

}
