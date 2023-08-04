package com.fileHandling.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeMainRead {
	public void read(File f) {
		if(f.exists()) {
			try {
				ObjectInputStream oi=new ObjectInputStream(new FileInputStream(f));
				ArrayList<Employee> e= (ArrayList<Employee>) oi.readObject();
				
				Iterator<Employee>it=e.iterator();
				while (it.hasNext()) {
					System.out.println(it.next());					
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			} 
			
		}
		
	}
	public static void main(String[] args) {
		EmployeeMainRead e=new EmployeeMainRead();
		File f=new File("D:\\\\ThinkQuestiontNew\\\\File Handling\\\\employee.ser");
		e.read(f);
	}

}
