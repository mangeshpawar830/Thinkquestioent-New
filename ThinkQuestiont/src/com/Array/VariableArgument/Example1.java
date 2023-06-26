package com.Array.VariableArgument;

public class Example1 {
	public void show(int...a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args) {
		Example1 ex=new Example1();
		ex.show(10);
		System.out.println("-----------");
		ex.show(10,20,30,40);
		System.out.println("-----------");
		ex.show(1,2,3,4);
	}

}
