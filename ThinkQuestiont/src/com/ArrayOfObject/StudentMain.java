package com.ArrayOfObject;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Student stud[]=new Student[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student details: ");
		for(int i=0;i<stud.length;i++) {
			System.out.print("Enter the Id: ");
			int id=sc.nextInt();
			System.out.print("Enter the name: ");
			String name=sc.next();
			System.out.print("Enter the percentage: ");
			double percentage=sc.nextDouble();
			Student stud1=new Student(id,name,percentage);
				stud[i]=stud1;
		}
		System.out.println("------All the Student--------");
		for(int i=0;i<stud.length;i++) {
			System.out.println(stud[i]);
		}
		System.out.println("-----percentage more than 60-------");
		for(int i=0;i<stud.length;i++) {
			if(stud[i].percentage>60)
				System.out.println(stud[i]);
		}
	}

}
