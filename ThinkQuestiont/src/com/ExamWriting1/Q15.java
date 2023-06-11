package com.ExamWriting1;

import java.util.Scanner;

public class Q15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter nth number: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			int fact=1;
			for(int j=1;j<=i;j++) {
				fact=fact*j;
				
			}
			sum=sum+fact;
			
		}
		System.out.println(sum);
	}

}
