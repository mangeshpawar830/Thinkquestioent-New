package com.Collection.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class Employee{
	int id;
	String name;
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+" "+name;
		
	}
	public int hashCode() {
		return id;
	}
	public boolean equals(Object o) {
		Employee em=(Employee) o;
		if(this.name.equals(em.name))
			return true;
		else
			return false;
		
	}
}

public class EmployeeMain {
	public static void main(String[] args) {
	HashMap<Employee, Integer>hmt=new HashMap<>();
	hmt.put(new Employee(102, "Patel"), 11);
	hmt.put(new Employee(104, "Patil"), 15);
	hmt.put(new Employee(108, "Pawar"), 9);
	hmt.put(new Employee(102, "Patel"), 11);
	
	Set s=hmt.entrySet();
	Iterator<Map.Entry<Employee, Integer>>it=s.iterator();
	while(it.hasNext()) {
		Map.Entry<Employee, Integer>m=it.next();
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	
	
			
	}
}
