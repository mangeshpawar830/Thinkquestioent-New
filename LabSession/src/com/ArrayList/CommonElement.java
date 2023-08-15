package com.ArrayList;

import java.util.ArrayList;

public class CommonElement{
    public static void main(String[] args){
        ArrayList<String>colour1=new ArrayList<>();
        colour1.add("red");
        colour1.add("black");
        colour1.add("yellow");
        colour1.add("green");

        ArrayList<String>colour2=new ArrayList<>();
        colour2.add("red");
        colour2.add("black");
        colour2.add("orange");

        System.out.println("------------------------------------");

        for (int i=0;i<colour1.size();i++){
            for (int j=0;j<colour2.size();j++){
                if (colour1.get(i).equals(colour2.get(j))){
                    System.out.println(colour1.get(i));
                }
            }
        }
        System.out.println("------------------------------------");
        
        ArrayList<String>commonElements=new ArrayList<>(colour1);
        commonElements.retainAll(colour2);
        System.out.println(commonElements);
        
        System.out.println("-------------uncommon elements-------------");
        
        for (int i=0;i<colour1.size();i++){
            boolean isUncommon=true; 
            	for (int j = 0; j < colour2.size(); j++){
                if (colour1.get(i).equals(colour2.get(j))){
                    isUncommon=false; 
                    break; 
                }
            }
            
            if (isUncommon){
                System.out.println(colour1.get(i));
            }
        }
        
            for (int i = 0; i < colour2.size(); i++) {
                boolean isUncommon = true; 
                
                for (int j = 0; j < colour1.size(); j++) {
                    if (colour2.get(i).equals(colour1.get(j))) {
                        isUncommon = false; 
                        break; 
                    }
                }
                
                if (isUncommon) {
                    System.out.println(colour2.get(i));
                }
        }
        
       

    }
}
