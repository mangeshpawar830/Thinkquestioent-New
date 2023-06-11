package com.khadijaMam;

public class Person {
    private int id;
    private String name;
    private Job job;

    public Person(int id, String name, Job job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public void displayPersonInfo() {
        System.out.println("Person Information:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Job Information:");
        System.out.println("Job ID: " + job.getJobId());
        System.out.println("Profile: " + job.getProfile());
        System.out.println("Joining Date: " + job.getJoiningDate().getDay() + "/" +
                job.getJoiningDate().getMonth() + "/" + job.getJoiningDate().getYear());
    }
}







