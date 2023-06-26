package com.String;

import java.util.Scanner;

public class NameAbbreviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();
        
        // Split the full name into individual names
        String[] names = fullName.split(" ");
        
        // Get the last name (last element in the names array)
        String lastName = names[names.length - 1];
        
        // Initialize the abbreviated name string
        StringBuilder abbreviatedName = new StringBuilder();
        
        // Iterate through the first and middle names
        for (int i = 0; i < names.length - 1; i++) {
            String name = names[i];
            
            // Get the first character of the name
            char initial = name.charAt(0);
            
            // Append the initial followed by a dot to the abbreviated name
            abbreviatedName.append(initial).append(".");
        }
        
        // Append the last name to the abbreviated name
        abbreviatedName.append(lastName);
        
        // Display the abbreviated name
        System.out.println("Abbreviated name: " + abbreviatedName.toString());
    }
}
