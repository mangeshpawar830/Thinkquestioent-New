package com.Collection.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class Departmennt{
	int dId;
	String name;
	public Departmennt(int dId, String name) {
		super();
		this.dId = dId;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Departmennt [dId=" + dId + ", name=" + name + "]";
	}
	
	
}

class Employee1{
	int id;
	String name;
	int salary;
	Departmennt dept;
	public Employee1(int id, String name, int salary, Departmennt dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
}

public class Employee1Main {
	public static void main(String[] args) {
		HashSet<Employee1>hs=new HashSet<>();
		hs.add(new Employee1(101, "mangesh", 10000, new Departmennt(1, "HR")));
		hs.add(new Employee1(105, "jay", 15000, new Departmennt(2, "sales")));
		hs.add(new Employee1(103, "vedang", 20000, new Departmennt(1, "HR")));
		hs.add(new Employee1(103, "vedant", 1000, new Departmennt(3, "mech")));
		
		
		
		HashMap<Departmennt, Integer>hm=new HashMap<>();
		Iterator<Employee1>it=hs.iterator();
		while(it.hasNext()) {
			Employee1 e=it.next();
			Departmennt d=e.dept;
			int salary=e.salary;
			if(hm.containsKey(d)) {
				int ab=hm.get(d);
				salary=salary+ab;
				hm.put(d, salary);
				
			}else {
				hm.put(d, salary);
				
			}
		}
		

	}

}
