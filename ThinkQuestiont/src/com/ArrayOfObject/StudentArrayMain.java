package com.ArrayOfObject;

import java.util.Scanner;

public class StudentArrayMain {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	StudentArray[]stud=new StudentArray[2];
	for(int i=0;i<stud.length;i++) {
		System.out.print("Enter the student id: ");
		int id=sc.nextInt();
		System.out.print("Enter the student name: ");
		String name=sc.next();
		System.out.println("Enter the marks: ");
		int[]mark=new int[3];
		for(int j=0;j<mark.length;j++) {
			mark[j]=sc.nextInt();
			
		}
		stud[i]=new StudentArray(id, name, mark);
		
	}
	for(int i=0;i<stud.length;i++) {
		System.out.println(stud[i]);
	}
	

}
}
