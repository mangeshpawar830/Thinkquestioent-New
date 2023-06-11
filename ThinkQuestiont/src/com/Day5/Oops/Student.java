package com.Day5.Oops;


//create a student class with id,name and three subject and 
//create three methods 1, accept details 2.calculate percentage using three subject
//marks 3.create third method to display all the details including percentage 
//and also find out the grade 


public class Student {
	int id;
	String name;
	int marathi;
	int hindi;
	int english;
	double percentage;
	String grade;
	
	public void acceptDetails(int aid,String aname,int amarathi,int ahindi,int aengilsh) {
		id=aid;
		name=aname;
		marathi=amarathi;
		hindi=ahindi;
		english=aengilsh;
		
		
	}
	public void calper() {
		percentage=(marathi+hindi+english)/3;
		
	}
	public void display() {
		System.out.println("id:"+id+" name:"+name+" percentage:"+percentage+" Grade:"+grade);
		
	}
	public void calGrade() {
		if(percentage>=90)
			grade="A Grade";
		else if(percentage>=60)
			grade="B Grade";
		else
			grade="C Grade";
		
	}
	
	public static void main(String[] args) {
		Student st1= new Student();
		st1.acceptDetails(1, "mangesh", 50, 65, 45);
		st1.calper();
		st1.calGrade();
		st1.display();
		
	}

}
