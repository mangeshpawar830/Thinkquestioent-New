package com.Collection.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Q.1)create a map which contain student has a key and course has a value and display it.

class Student{
	int id;
	String name;
	
	public Student(int id,String name) {
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
		Student s=(Student) o;
		if(this.id==s.id)
			return true;
		return false;
	}
}

public class StudentMain {
	public static void main(String[] args) {
		HashMap<Student, String>hm=new HashMap<>();
		hm.put(new Student(101,"jay"),"java");
		hm.put(new Student(103,"vedang"), "python");
		hm.put(new Student(100,"mangesh"), "c++");
		hm.put(new Student(101,"jay"), "python");
		
		Set s=hm.entrySet();
		Iterator<Map.Entry<Student,String>>it=s.iterator();
		while(it.hasNext()) {
			Map.Entry<Student, String>m=it.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
