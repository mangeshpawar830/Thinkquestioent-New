package com.Day4.dOWhile;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			char choice;
			do {
			System.out.print("Enter the Number: ");
			int num=sc.nextInt();
			
			switch(num%2) {
			case(0):System.out.println("even number");
			break;
			default:System.out.println("odd number");
			}
			System.out.print("We want more operation: ");
			choice=sc.next().charAt(0);
			}while(choice=='y'||choice=='Y');
			
		}
	

}
