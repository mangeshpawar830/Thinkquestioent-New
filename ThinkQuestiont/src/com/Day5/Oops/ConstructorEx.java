package com.Day5.Oops;

//write code which contain parameter less constructor and parameterized 
//constructor give call to both constructor

public class ConstructorEx {
	public ConstructorEx() {
		int id=1;
		String name="mangesh";
		System.out.println("id:"+id+" name:"+name);
		
		
	}
	public ConstructorEx(int id, String name){
		
		System.out.println("id:"+id+" name:"+name);
		
	}
	
	
	public static void main(String[] args) {
		ConstructorEx cx= new ConstructorEx();
		ConstructorEx cx1=new ConstructorEx(2,"vedang");
		
		
	}

}
