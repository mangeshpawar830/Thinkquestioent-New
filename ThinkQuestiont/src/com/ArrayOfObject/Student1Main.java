package com.ArrayOfObject;

import java.util.Scanner;

public class Student1Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student1[] student=new Student1[3];
		System.out.println("Enter the Student Details...");
		for(int i=0;i<student.length;i++) {
			System.out.print("Enter the student id: ");
			int studId=sc.nextInt();
			System.out.print("Enter the student name: ");
			String studName=sc.next();
			System.out.print("Enter course id: ");
			int courseId=sc.nextInt();
			System.out.print("Enter course name: ");
			String courseName=sc.next();
			System.out.print("Enter course fess: ");
			int fees=sc.nextInt();
			
			Student1 stud=new Student1();
			stud.setStudId(studId);
			stud.setStudName(studName);
			stud.setCourse(new Course());
			stud.course.setCourseId(courseId);
			stud.course.setCourseName(courseName);
			stud.course.setCourseFees(fees);
			student[i]=stud;
			
			
		}
		System.out.println("---------------------------------");
		for(int i=0;i<student.length;i++) {
			System.out.println(student[i].getStudId()+" "+student[i].getStudName()+" "+student[i].course.getCourseId()+student[i].course.getCourseName()+" "+student[i].course.getCourseFees());
		}

}
}
