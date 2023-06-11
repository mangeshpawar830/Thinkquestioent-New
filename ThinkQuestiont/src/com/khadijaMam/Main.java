package com.khadijaMam;

public class Main {
    public static void main(String[] args) {
        // Create JoiningDate object
        JoiningDate joiningDate = new JoiningDate(10, 6, 2022);

        // Create Job object
        Job job = new Job(1, "Software Engineer", joiningDate);

        // Create Person object
        Person person = new Person(1, "Mangesh Pawar", job);

        // Display person information
        person.displayPersonInfo();
    }
}
