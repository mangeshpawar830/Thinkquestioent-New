package com.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public void copy(File fi,File fo) {
		if(fi.exists()) {
			try {
				fo.createNewFile();
				FileInputStream fin=new FileInputStream(fi);
				FileOutputStream fout=new FileOutputStream(fo);
				int i;
				while((i=fin.read())!=-1) {
					fout.write(i);
				}
				System.out.println("file copied...");
				fin.close();
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	public static void main(String[] args) {
		File fi=new File("D:\\ThinkQuestiontNew\\File Handling\\ab.txt");
		File fo=new File("D:\\ThinkQuestiontNew\\File Handling\\abc.txt");
		CopyFile cf=new CopyFile();
		cf.copy(fi,fo);
	}

}
