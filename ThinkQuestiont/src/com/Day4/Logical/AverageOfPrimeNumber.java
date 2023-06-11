package com.Day4.Logical;

public class AverageOfPrimeNumber {
	public static void main(String[] args) {
		int temp=0;
		int sum=0;
		for(int num=1;num<=10;num++) {
			int count=0;
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					count++;
				}
			}
			if(count==0) {
				temp++;
				sum=sum+num;
				}
					
			}
		double average=sum/temp;
		System.out.println("Average of prime number is: "+average);
	

	}
	

}
