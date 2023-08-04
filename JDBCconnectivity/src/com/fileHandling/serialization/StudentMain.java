package com.fileHandling.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudentMain {
	 Scanner sc=new Scanner(System.in);
	public void readFile(File f) throws IOException {
		ObjectInputStream oin=null;
		try {
		if(f.exists()) {
			 oin=new ObjectInputStream(new FileInputStream(f));
			for(int i=0;i<3;i++) {
			Student st=(Student) oin.readObject();
			System.out.println(st);
			}

		}
		}catch(Exception e){
			e.printStackTrace();
		}
		oin.close();

		
	}
	public  void  writeFile(File f) {
		try {
		if(!f.exists()) {
			f.createNewFile();
		
		ObjectOutputStream fout=new ObjectOutputStream(new FileOutputStream(f));
		Student st[]=new Student[3];
		for(int i=0;i<st.length;i++) {
			st[i]=new Student();
		System.out.print("Enter id: ");
			st[i].setId(sc.nextInt());
			System.out.print("Enter name: ");
			st[i].setName(sc.next());
			System.out.print("Enter marks: ");
			st[i].setMarks(sc.nextFloat());
			fout.writeObject(st[i]);
		}
		fout.close();
		}
		}catch(Exception e){
			System.out.println(e);
		}
		
		
	}
	public static void main(String[] args) throws Exception {
		File f1=new File("D:\\ThinkQuestiontNew\\File Handling\\student1.txt");
		StudentMain sm=new StudentMain();
		sm.writeFile(f1);
		sm.readFile(f1);
		
	}

}
