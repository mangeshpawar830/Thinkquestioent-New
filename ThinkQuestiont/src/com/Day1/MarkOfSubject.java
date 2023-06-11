package com.Day1;

import java.util.Scanner;

public class MarkOfSubject {
	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter Marathi Subject Marks: ");
	int marathi=sc.nextInt();
	System.out.print("Enter Hindi Subject Marks: ");
	int hindi=sc.nextInt();
	System.out.print("Enter Math Subject Marks: ");
	int math=sc.nextInt();
	System.out.print("Enter Engilsh Subject Marks: ");
	int english=sc.nextInt();
	System.out.print("Enter History Subject Marks: ");
	int history=sc.nextInt();
	
	int total=marathi+hindi+history+english+math;
	
	System.out.println("Total Marks of Subject :"+total);
	
	double percentage=(total/500.0)*100;
	System.out.println("Total Percentage: "+percentage);
	}

}
