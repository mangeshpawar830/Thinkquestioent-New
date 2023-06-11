package com.Day2.Switch;

import java.util.Scanner;

public class DayNumber {
	//take a day number from user and display respected day name

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Sunday\t 2.Monday\t 3.Tuesday\t 4.Wednesday\t 5.Thursday\t 6.Friday\t 7.Saturday");
		System.out.print("Enter the number: ");
		int input=sc.nextInt();
		
		switch(input){
		case(1):System.out.println("Sunday");
		break;
		case(2):System.out.println("Monday");
		break;
		case(3):System.out.println("Tuesday");
		break;
		case(4):System.out.println("Wednesday");
		break;
		case(5):System.out.println("Thursday");
		break;
		case(6):System.out.println("Friday");
		break;
		case(7):System.out.println("Saturday");
		break;
		default:
		System.out.println("Invalid Input");
		

		
		}
		
		

	}

}
