package com.fileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInput {
	public void  writedata(File f)
	{
		try
		{
			f.createNewFile();
			DataOutputStream dout=new DataOutputStream(new FileOutputStream(f));
			dout.writeInt(10);
			dout.writeUTF("Jay Surawanshi");
			dout.writeFloat(89.5f);
			
			System.out.println("data added");
			dout.close();
		}
		 catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void readData(File f)
	{
		try
		{
			if(f.exists())
			{
				DataInputStream din=new DataInputStream(new FileInputStream(f));
				
				System.out.println(din.readInt());
				System.out.println(din.readUTF());
				System.out.println(din.readFloat());
			}
		}
		catch (Exception e) {
			System.out.println(e);		}
	}
	public static void main(String[] args) {
		
		DataInput d=new DataInput();
		File f=new File("D:\\ThinkQuestiontNew\\File Handling\\ab.txt");	
		d.writedata(f);
		d.readData(f);
		
	}
	

}
