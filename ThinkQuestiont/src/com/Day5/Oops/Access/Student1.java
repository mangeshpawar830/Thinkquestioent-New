package com.Day5.Oops.Access;

public class Student1 {
	public int rollNo=1;
	private int admissionNo=12;
	protected int age=123;
	int courseId=1234;
	
	public void doPublic() {
		System.out.println("public method");
	}
	 void doDefault() {
			System.out.println("default method");

	}
	 protected void doProtected() {
			System.out.println("protected method");

			
	}
	 private void doPrivate() {
			System.out.println("private method");

	 }
		
	
	

}
