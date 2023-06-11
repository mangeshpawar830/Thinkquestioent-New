package com.Day5.Oops.Access;

public class TQPPStudent extends Student1{
	public void checkStudentVariableAccess(){
		this.rollNo=12;
		this.age=123;
		this.courseId=45;
		
	}
	public void checkStudentMethodAccess() {
		this.doDefault();
		this.doProtected();
		this.doPublic();
	}
	

}
