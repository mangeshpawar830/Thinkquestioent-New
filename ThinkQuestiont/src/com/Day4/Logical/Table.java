package com.Day4.Logical;

//write code to print table between 1 to 5

public class Table {
	public static void main(String[] args) {
		for(int num=1;num<=5;num++) {
			
			for(int i=1;i<=10;i++) {
				System.out.print(num*i+", ");
			}
			System.out.println();
		}
		
	}

}
