package com.Day5.Oops;

import com.Day5.Oops.Access.Student1;

public class OtherPackageStudent extends Student1{

	public void checkStudentVariableAccess() {
		System.out.println(this.age);
		System.out.println(this.rollNo);
	}
	public void checkStudentMethodAccess() {
		super.doProtected();
		doPublic();
	}
	public void doProtected() {
		System.out.println("Protected method of this class");
	}
	
	public static void main(String[] args) {
		Student1 st=new Student1();
		st.rollNo=25;
		System.out.println(st.rollNo);
		
		
		OtherPackageStudent o=new OtherPackageStudent();
		o.checkStudentMethodAccess();
		o.checkStudentVariableAccess();
		o.doProtected();
		
	}
}
