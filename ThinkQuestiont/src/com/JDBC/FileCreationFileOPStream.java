package com.JDBC;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileCreationFileOPStream {
	public static void main(String[] args) {

		try {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the file name: ");
		String name=sc.nextLine();
		
			FileOutputStream fos=new FileOutputStream(name);
			System.out.println("Enter the file content: ");
			String str=sc.nextLine()+"\n";
			byte b[]=str.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("file saved...");
			} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
