package com.khadijaMam;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Student[]student=new Student[1];
		int marks[]=new int[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<student.length;i++) {
			System.out.print("Enter the studentId: ");
			int id=sc.nextInt();
			System.out.print("Enter student name: ");
			String name=sc.next();
			int sum=0;
			for(int j=0;j<marks.length;j++) {
				System.out.print("Enter marks: ");
				marks[j]=sc.nextInt();
				
			}
		
			
				Student stud=new Student();
				stud.setId(id);
				stud.calPercentage();
				stud.setName(name);
				stud.setMarks(marks);
				
				student[i]=stud;
		}
		System.out.println("-------------");
		for(int i=0;i<student.length;i++) {
			System.out.println(student[i].getId()+" "+student[i].getName()+" "+Arrays.toString(marks)+student[i].getPercentage());
		}
	}

}
