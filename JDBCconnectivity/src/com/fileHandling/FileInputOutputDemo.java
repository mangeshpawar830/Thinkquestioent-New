package com.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputOutputDemo {
	
	public  static void write(File f) {
		try {
			String data="bbjb njhjnj njnjnm";
			FileOutputStream fo=new FileOutputStream(f);
			byte arr[]=data.getBytes();
			fo.write(arr);
			
			System.out.println("data added...");
			fo.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public  static void read(File f) {
		try {
		if(f.exists()) {
			FileInputStream fi=new FileInputStream(f);
			int i=0;
			
				while((i=fi.read())!=-1) {
					System.out.println((char)i);
				}
			
			fi.close();
			
		}else {
			System.out.println("file not present...");
		}
			}catch(Exception e) {
				System.out.println(e);
			}
			
		
		
		
		
	}

	public static void main(String[] args) {
		File f=new File("D:\\ThinkQuestiontNew\\File Handling\\ab.txt");
		
		//write(f);
		read(f);
	}

}
