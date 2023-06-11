package com.Day3.While;

//write code to display number between 1 to 20, if any number is 
	//divisible by 4 and 6 then stop the loop-break and continue using

public class ProblemStatement1 {
	public static void main(String[] args) {
		int i=1;
		while(i<=20) {
			if(i%4==0 && i%6==0) {
				break;
			}
			
			System.out.println(i);
			i++;
		}
		
	}

}
