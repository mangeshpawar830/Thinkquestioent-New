package com.practice.Str;

public class Example1 {
	public static void main(String[] args) {
		String str="java is programming language";
		String rev="";
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i].length()-1;j>=0;j--) {
				rev=rev+arr[i].charAt(j);
			}
			rev=rev+" ";
			
		}
		System.out.println(rev);
	}

}
