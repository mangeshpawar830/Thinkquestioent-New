package com.Day3.While;

public class CountOddNumber {
	//write code to count number of odd numbers between 1 to 20

	public static void main(String[] args) {
		int count=0;
		int i=1;
		while(i<=20) {
			if(i%2!=0){
				count++;
			}
			i++;
		}
		System.out.println("Count of Odd Number: "+count);
		
		
	}

}