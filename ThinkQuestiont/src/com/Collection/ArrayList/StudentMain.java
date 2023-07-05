package com.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no.of student: ");
		int no=sc.nextInt();
		ArrayList<Student>al=new ArrayList<>();
		for(int i=0;i<no;i++) {
			System.out.print("Enter the student id: ");
			int id=sc.nextInt();
			System.out.print("Enter the student name: ");
			String name=sc.next();
			System.out.println("Enter student marks: ");
			int Marks[]=new int[4];
			int sum=0;
			for(int j=0;j<Marks.length;j++) {
				Marks[j]=sc.nextInt();
				sum=sum+Marks[j];
			}
			double per=(float)sum/Marks.length;
			
			Student stud=new Student();
			stud.setId(id);
			stud.setName(name);
			stud.setMarks(Marks);
			stud.setPer(per);
			al.add(stud);
		}
		for(Student st:al) {
			System.out.println(st.getId()+" "+st.getName()+" "+st.getPer());
		}
	}

}
