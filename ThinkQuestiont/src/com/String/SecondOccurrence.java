package com.String;

public class SecondOccurrence {
    public static int findSecondOccurrence(String string, char character) {
        int firstOccurrence = string.indexOf(character);
        int secondOccurrence = string.indexOf(character, firstOccurrence + 1);
        return secondOccurrence;
    }

    public static void main(String[] args) {
        String givenString = "java programs";
        char characterToFind = 'a';

        int secondOccurrenceIndex = findSecondOccurrence(givenString, characterToFind);

        if (secondOccurrenceIndex != -1) {
            System.out.println("The second occurrence of '" + characterToFind + "' is at index " + secondOccurrenceIndex + ".");
        } else {
            System.out.println("'" + characterToFind + "' does not appear twice in the given string.");
        }
    }
}

