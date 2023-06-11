package com.Exam2;

class D {
	static int cnt;
	int j;
	public static void main(String[] args) {
		D d1=new D();
		D d2=new D();
		D d3=new D();
		d1.j=5;
		d2.j=10;
		d3.j=25;
		d1.cnt=1;
		d2.cnt=2;
		d3.cnt=3;
		System.out.println(d1.cnt);
	}
}