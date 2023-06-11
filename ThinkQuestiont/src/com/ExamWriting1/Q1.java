package com.ExamWriting1;

//Write a program to print all numbers between 1 to 100 except
//the numbers which are divisible by 5 or 10

public class Q1 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%5==0 || i%10==0)
				System.out.println(i);
		}
	}

}
