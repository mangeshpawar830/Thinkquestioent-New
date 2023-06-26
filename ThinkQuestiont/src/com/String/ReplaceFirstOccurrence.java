package com.String;


public class ReplaceFirstOccurrence {
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        char targetChar = 'o';
        String replacementString = "Java";

        String modifiedString = replaceFirst(originalString, targetChar, replacementString);

        System.out.println("Modified String: " + modifiedString);
    }

    public static String replaceFirst(String originalString, char targetChar, String replacementString) {
        int index = originalString.indexOf(targetChar);
        if (index == -1) {
            return originalString;
        }

        String before = originalString.substring(0, index);
        String after = originalString.substring(index + 1);

        return before + replacementString + after;
    }
}
