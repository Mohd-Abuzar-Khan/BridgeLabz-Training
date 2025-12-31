package com.objectmodeling.levelone;
import java.util.ArrayList;
import java.util.List;

// Student class represents a student entity
// Student can exist independently (Aggregation with School)
public class Student {

    private String name;
    private int id;

    // Each student can enroll in multiple courses
    private List<SchoolCourse> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    // Enroll student in a course
    public void enrollCourse(SchoolCourse course) {
        courses.add(course);
        course.addStudent(this); // maintain bidirectional relationship
    }

    // View all enrolled courses
    public void viewCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        for (SchoolCourse course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}
