package com.fileHandling;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File f=new File("D:\\ThinkQuestiontNew\\File Handling\\ab.txt");
		
		if(f.exists()) {
			if(f.isFile()) {
				System.out.println(f.canWrite());
				System.out.println(f.length());
				System.out.println(f.getName());
				System.out.println(f.getPath());
				System.out.println(f.exists());
				
			}
			else {
				System.out.println("it is directory..");
			}
		}else {
			System.out.println("it is not present");
		}
	}

}
