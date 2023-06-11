package com.Day5.Oops;

public class Course {
    int id;
    String name;
    SubCourse subCourse;

    public Course() {
        System.out.println("Course object created.");
        subCourse = new SubCourse();
    }

    public Course(int id, String name, SubCourse subCourse) {
        this.id = id;
        this.name = name;
        this.subCourse = subCourse;
    }

    public static void main(String[] args) {
        Course course = new Course();
        System.out.println("Course ID: " + course.id);
        System.out.println("Course Name: " + course.name);
        System.out.println("SubCourse ID: " + course.subCourse.getSubCourseId());
        System.out.println("SubCourse Name: " + course.subCourse.getSubCourseName());
    }
}

class SubCourse {
    int subCourseId;
    String subCourseName;

    public SubCourse() {
        System.out.println("SubCourse object created.");
        subCourseId = 1;
        subCourseName = "Introduction to Java";
    }

    public int getSubCourseId() {
        return subCourseId;
    }

    public String getSubCourseName() {
        return subCourseName;
    }
}




