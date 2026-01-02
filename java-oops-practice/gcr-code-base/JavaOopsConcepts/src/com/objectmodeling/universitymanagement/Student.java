package com.objectmodeling.universitymanagement;
import java.util.ArrayList;
import java.util.List;

// Represents a student in the university
public class Student {

    // Unique ID for the student
    private int id;

    // Name of the student
    private String name;

    // List of courses the student is enrolled in
    private List<Course> enrolledCourses;

    // Constructor to initialize student details
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    // Method to enroll a student in a course
    public void enrollCourse(Course course) {
        enrolledCourses.add(course);   // add course to student's list
        course.addStudent(this);       // add student to course list
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    // Getter for student name
    public String getName() {
        return name;
    }
}
