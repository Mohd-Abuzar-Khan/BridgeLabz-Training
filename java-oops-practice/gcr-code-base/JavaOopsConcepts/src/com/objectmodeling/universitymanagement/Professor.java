package com.objectmodeling.universitymanagement;
import java.util.ArrayList;
import java.util.List;

// Represents a professor in the university
public class Professor {

    // Unique ID for professor
    private int id;

    // Name of the professor
    private String name;

    // List of courses the professor teaches
    private List<Course> coursesTeaching;

    // Constructor to initialize professor details
    public Professor(int id, String name) {
        this.id = id;
        this.name = name;
        this.coursesTeaching = new ArrayList<>();
    }

    // Assigns a professor to a course
    public void assignCourse(Course course) {
        coursesTeaching.add(course);     // add course to professor's list
        course.setProfessor(this);       // set professor for the course
        System.out.println(name + " is assigned to teach " + course.getCourseName());
    }

    // Getter for professor name
    public String getName() {
        return name;
    }
}
