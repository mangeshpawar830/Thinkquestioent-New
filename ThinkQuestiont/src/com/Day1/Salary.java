package com.Day1;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		System.out.print("Enter Basic Salary: ");
		Scanner sc=new Scanner(System.in);
		int basicSalary=sc.nextInt();
		
		double pf=basicSalary*0.10;
		System.out.println("PF is: "+pf);
		
		double da=basicSalary*0.15;
		System.out.println("DA is: "+da);
		
		double hra=basicSalary*0.20;
		System.out.println("HRA is: "+hra);
		
		double netSal=(basicSalary+pf+da+hra)-0.02;
		System.out.println("DNet Salary is: "+netSal);
		
		
		
		
		
		
	
		
	}

}
