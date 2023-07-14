package com.String;

import java.util.Scanner;

public class PyramidionString {
	

	  public static int RecursionChallenge(int num) {
	    if (num == 0 || num == 1) {
	      return 1;
	    } else {
	      return num * RecursionChallenge(num - 1);
	    }
	  }
	  
	  public static String replaceEveryThird(String str, char replacement) {
	    StringBuilder result = new StringBuilder();
	    for (int i = 0; i < str.length(); i++) {
	      if ((i + 1) % 3 == 0) {
	        result.append(replacement);
	      } else {
	        result.append(str.charAt(i));
	      }
	    }
	    return result.toString();
	  }

	  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int num = s.nextInt();
	    s.nextLine(); // Consume the remaining newline character
	    
	    String challengeToken = "0h4e3kft5d";
	    String finalOutput = RecursionChallenge(num) + challengeToken;
	    finalOutput = replaceEveryThird(finalOutput, 'X');
	    System.out.print(finalOutput);
	  }
	

}
