package com.String;

import java.util.Scanner;

public class CompressStrng {
	    public static void main(String[] args) {
	        String input = "aaaabbcccddaabb";
	        String compressedString = compressString(input);
	        System.out.println("Compressed String: " + compressedString);
	    }

	    public static String compressString(String input) {
	        if (input.isEmpty()) {
	            return "";
	        }

	        StringBuilder compressed = new StringBuilder();
	        int count = 1;
	        char currentChar = input.charAt(0);

	        for (int i = 1; i < input.length(); i++) {
	            if (input.charAt(i) == currentChar) {
	                count++;
	            } else {
	                if (count > 1) {
	                    compressed.append(currentChar).append(count);
	                } else {
	                    compressed.append(currentChar);
	                }
	                currentChar = input.charAt(i);
	                count = 1;
	            }
	        }

	        if (count > 1) {
	            compressed.append(currentChar).append(count);
	        } else {
	            compressed.append(currentChar);
	        }

	        return compressed.toString();
	    }
	

    }

