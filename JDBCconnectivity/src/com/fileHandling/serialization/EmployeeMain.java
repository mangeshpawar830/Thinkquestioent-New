package com.fileHandling.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeMain {
	Scanner sc=new Scanner(System.in);
	ArrayList<Employee>e=new ArrayList<>();

	public void write(File f) {
		try {
			if(f.exists()) {
				f.createNewFile();
				ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(f));
				System.out.print("How many employee? : ");
				int size=sc.nextInt();
				for(int i=0;i<size;i++) {
				
				System.out.println("Enter employee id: ");
				int id=sc.nextInt();
				System.out.print("Enter employee name: ");
				String name=sc.next();
				System.out.print("Enter salary: ");
				float sal=sc.nextFloat();
				System.out.print("Enter employee code: ");
				int code=sc.nextInt();
				e.add(new Employee(id, name, sal, code));
				}
				e.add(new Employee(103,"shivam",50000,333));
				os.writeObject(e);
				
				os.close();
			
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		File f=new File("D:\\\\ThinkQuestiontNew\\\\File Handling\\\\employee.ser");
		EmployeeMain em=new EmployeeMain();
		em.write(f);
	}

}
