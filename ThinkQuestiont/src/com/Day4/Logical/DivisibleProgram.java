package com.Day4.Logical;

public class DivisibleProgram {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++) {
			if(i%3==0&&i%5==0)
				System.out.println("OneXTel");			
			else if(i%5==0)
				System.out.println("Tel");
			else if(i%3==0)
				System.out.println("OneX");
			else
				System.out.println(i);
		}
		
	}

}
