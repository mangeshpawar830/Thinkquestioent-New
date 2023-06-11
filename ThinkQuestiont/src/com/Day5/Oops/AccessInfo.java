package com.Day5.Oops;

public class AccessInfo {
	public static void main(String[] args) {
		AccessModifier ac1=new AccessModifier();
		System.out.println(ac1.marks);//public
		System.out.println(ac1.name);//default
		System.out.println(ac1.rollNo);//protected
	}

}
