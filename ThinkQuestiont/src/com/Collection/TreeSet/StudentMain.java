package com.Collection.TreeSet;

import java.util.ArrayList;
import java.util.HashMap;

/*Q2)create arraylist of student which contain id,name,marks. create a class result treeset
 type which contain student id and total score. and display set in descending order*/

class Student{
	int id;
	String name;
	int marks;
	
	public Student(int id,String name,int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
class Result{
	int id;
	int totalMarks;
	
	public Result(int id, int totalMarks) {
		this.id = id;
		this.totalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Result [id=" + id + ", totalMarks=" + totalMarks + "]";
	}
	
	
	
	
	
}
	

public class StudentMain {
	public static void main(String[] args) {
		ArrayList<Student>al=new ArrayList<>();
		al.add(new Student(101,"mangesh",56));
		al.add(new Student(101,"mangesh",65));
		al.add(new Student(101,"mangesh",98));
		al.add(new Student(102,"vedant",62));
		al.add(new Student(102,"vedant",96));
		al.add(new Student(102,"vedant",86));
		al.add(new Student(103,"jay",56));
		al.add(new Student(103,"jay",98));
		al.add(new Student(103,"jay",75));
		
		HashMap<Integer, Integer>st=new HashMap<>();
		for(Student stud:al) {
			if(st.containsKey(stud.id)) {
				int totalMarks=st.get(stud.id);
				totalMarks=totalMarks+stud.marks;
				st.put(stud.id, totalMarks);
			}else {
				st.put(stud.id, stud.marks);
			}
		}
		System.out.println(st);
		
	}
	
	

}
