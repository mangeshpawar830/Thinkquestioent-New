package com.Day3.While;

import java.util.Scanner;

public class AverageOfDigit {
	//average of digit from number
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the number: ");
			int num=sc.nextInt();
			int sum=0;
			int count=0;
			
			while(num>0) {
				int digit=num%10;
				sum=sum+digit;
				
				num=num/10;
				count++;
			}
			double average=sum/count;
			System.out.println("Average Of Digit is: "+average);
		
		}

}
