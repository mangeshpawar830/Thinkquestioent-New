package com.fileHandling.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class UserObjectIO {
	Scanner sc=new Scanner(System.in);
	User us=new User();
	public void writeFile(File f) {
		try {
		if(!f.exists()) {
			f.createNewFile();
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));
			
			System.out.print("Enter user id: ");
			us.setUserid(sc.nextInt());
			System.out.print("Enter user name: ");
			us.setUserName(sc.next());
			System.out.print("Enter password: ");
			us.setPassWord(sc.next());
			oos.writeObject(us);
			System.out.println("------------------");
			oos.close();
			
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	public void readFile(File f) {
		try {
			System.out.print("Enter password: ");
			if(sc.next().equals(us.getPassWord())) {
			if(f.exists()) {
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f));
				User u=(User) ois.readObject();
				System.out.println(u);
				ois.close();
			}
			}else {
				System.out.println("incorrect password");
			}
			
		}catch(Exception e){
			
		}
		
	}
	public static void main(String[] args) {
		File f=new File("D:\\ThinkQuestiontNew\\File Handling\\user1.txt");
		UserObjectIO uo=new UserObjectIO();
		uo.writeFile(f);
		uo.readFile(f);
	}

}
