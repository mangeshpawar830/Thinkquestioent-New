package com.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

//delete all the employee who are working in a same department like
//employee id 10

class Employee3{
	int id;
	String name;
	int salary;
	String dept;
	
	public Employee3(int id, String name, int salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee3 [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
	
}
public class Employee3Main {
	public static void main(String[] args) {
		ArrayList<Employee3>emp=new ArrayList<>();
		emp.add(new Employee3(101, "mangesh", 10000, "HR"));
		emp.add(new Employee3(102, "jay", 10000, "sales"));
		emp.add(new Employee3(103, "vedang", 10000, "Admin"));
		emp.add(new Employee3(104, "vedant", 10000, "sales"));
		emp.add(new Employee3(105, "appa", 10000, "HR"));
		
		String deptName="";
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).id==101) {
				deptName=emp.get(i).dept;
			}
			if(emp.get(i).dept.equals(deptName)) {
				emp.remove(emp.get(i));
			}
		}
		System.out.println(emp);
		
	}
}

		
		/*int empId=101;
		Employee3 emp2=null;
		
		for(Employee3 em:emp) {
			if(em.id==empId) {
				emp2=em;
				break;
			}
		}
		if(emp2!=null) {
			String empdept=emp2.dept;
			Iterator<Employee3>it=emp.iterator();
			while(it.hasNext()) {
				Employee3 em=it.next();
				if(em.dept.equals(empdept)) {
					it.remove();
				}
			}
		}
		System.out.println(emp);

	}
*/

