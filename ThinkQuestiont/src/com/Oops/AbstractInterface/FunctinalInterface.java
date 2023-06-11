package com.Oops.AbstractInterface;

interface sayable{  
    void say(String msg);  
}  
  
        
    
public class FunctinalInterface implements sayable{
	public void say(String msg){  
		System.out.println(msg);  
	}  
	public static void main(String[] args) {  
		FunctinalInterface fi = new FunctinalInterface();  
		fi.say("Hello there...");  
	} 
   

	

}

