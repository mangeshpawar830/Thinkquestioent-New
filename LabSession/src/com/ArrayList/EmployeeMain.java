package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			ArrayList<Department>list=new ArrayList<>();
			list.add(new Department(101,"Hr",new Employee(1,"Ram",55000)));
			list.add(new Department(102,"Sales",new Employee(1,"Pream",40000)));
			list.add(new Department(103,"Marketing",new Employee(1,"Baban",75000)));
			list.add(new Department(102,"Sales",new Employee(2,"Narayan",45000)));
			list.add(new Department(103,"Marketing",new Employee(2,"Nana",60000)));
			list.add(new Department(101,"Hr",new Employee(2,"Pranav",70000)));
			list.add(new Department(103,"Marketing",new Employee(3,"Nandan",55000)));
			
			for(Department d:list)
			{
				System.out.println(d);
			}
			System.out.println("--------------------------------------------------");
			
			Iterator<Department>it=list.iterator();
			System.out.println("Enter Department name: ");
			String dname=sc.next();
			while(it.hasNext())
			{
				Department d=it.next();
				if(d.getDname().equalsIgnoreCase(dname))
				{
					System.out.println(d.getE().getEid()+" "+d.getE().getEname()+" "+d.getE().getSalary());
				}
			}
			
		

		
	
	}

}
