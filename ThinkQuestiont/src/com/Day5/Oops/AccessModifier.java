package com.Day5.Oops;

public class AccessModifier {
	private int id=1;
	String name="mangesh";
	protected int rollNo=121;
	public int marks=65;
	
	private void doPrivate() {
		System.out.println("This is private..");
	}
	
	public static void main(String[] args) {
		AccessModifier am=new AccessModifier();
		am.doPrivate();
		System.out.println(am.id);
		System.out.println(am.marks);
		System.out.println(am.rollNo);
		System.out.println(am.name);
		
	}
	

}
