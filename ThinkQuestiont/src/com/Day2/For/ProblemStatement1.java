package com.Day2.For;

	//write code to display number between 1 to 20, if any number is 
	//divisible by 4 and 6 then stop the loop-break and continue using

public class ProblemStatement1 {
	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
			if(i%4==0 && i%6==0) {
				break;
				
			}
			System.out.println(i);
		}
		
	}

}
