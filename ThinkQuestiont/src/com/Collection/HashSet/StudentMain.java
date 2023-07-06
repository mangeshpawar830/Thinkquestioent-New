package com.Collection.HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class Student implements Comparable<Student>{
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
		return o.marks-this.marks;
	}
	
	
}

public class StudentMain {
	public static void main(String[] args) {
		HashSet<Student>hs=new HashSet<>();
		hs.add(new Student(101, "mangesh", 65));
		hs.add(new Student(105, "jay", 61));
		hs.add(new Student(104, "vedant", 64));
		hs.add(new Student(106, "vedang", 62));
		hs.add(new Student(108, "rushi", 67));
		
		ArrayList<Student>al=new ArrayList<>();
		al.addAll(hs);
		Collections.sort(al);
		for(Student stud:al) {
			System.out.println(stud );
		}
		
		

	
	}

}

