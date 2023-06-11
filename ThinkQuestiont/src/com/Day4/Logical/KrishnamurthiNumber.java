package com.Day4.Logical;

import java.util.Scanner;

//krishnamurthi number-145 

public class KrishnamurthiNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			
			int fact=1;
			for(int i=1;i<=rem;i++) {
			fact=fact*i;
		}
			sum=sum+fact;
			num=num/10;
		}
		if(temp==sum)
			System.out.println("KrishnaMurthi Number");
		else
			System.out.println("Not KrishnaMurthi Number");
	}

}
