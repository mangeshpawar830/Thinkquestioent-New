package com.Day4.Logical;

import java.util.Scanner;

//write code to find the frequency of each digit from
//the number-occurances

public class FrequencyOfDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num=sc.nextInt();
		System.out.println("Number\tFrequency");
		int digit,i;
		for(i=0;i<=9;i++) {
		int count=0;
		int temp=num;
		
		while(temp!=0) {
			digit=temp%10;
			if(digit==i)
			count++;
			temp=temp/10;
			
		}
		
		if(count>0)
		
		System.out.println(i+"\t"+count);
	}
	}

}
