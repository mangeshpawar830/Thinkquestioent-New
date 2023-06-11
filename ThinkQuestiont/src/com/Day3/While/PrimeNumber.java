package com.Day3.While;

import java.util.Scanner;

public class PrimeNumber {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the number: ");
			int num=sc.nextInt();
			
			int count=0;
			int i=2;
			while(i<num) {
				if(num%i==0)
					count++;
				i++;
			}
			if(count==0)
				System.out.println("Prime Number");
			else
				System.out.println("Not Prime Number");
		}

	

}
