package com.Day5.Oops.Access;

public class StudentMain {
	public static void main(String[] args) {
		Student1 st=new Student1();
		System.out.println(st.rollNo);//public
		System.out.println(st.age);//protected
		System.out.println(st.courseId);//default
		
		st.doDefault();
		st.doProtected();
		st.doPublic();
	}

}
