package com.khadijaMam;

public class KidMain {
    public static void main(String[] args) {
        Kid kid = new Kid();
        kid.readBook(); // Calls the readBook() method in the Kid class

        kid.readBook("Vedant", "J.K"); // Calls the overloaded readBook() method in the Kid class

        BigKid bigKid = new BigKid();
        bigKid.readBook(); // Calls the overridden readBook() method in the BigKid class
    }
}
