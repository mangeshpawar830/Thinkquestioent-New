package com.String;

public class ReverseAString {
	static void reverse(String str) {
		String arr[]=str.split("\\s");
		String reverse="";
		for(int i=arr.length-1;i>=0;i--) {
		
		
				reverse=reverse+arr[i];
				if(i!=0) {
					reverse=reverse+" ";
				}
		}
		System.out.println(reverse);
		
	}
	public static void main(String[] args) {
		String str="java is programming language";
		ReverseAString.reverse(str);
	}

}
