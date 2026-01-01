package com.objectmodeling.coursemanagement;
import java.util.ArrayList;
import java.util.List;

// Course class represents a subject
// It is associated with multiple students
public class SchoolCourse {

    private String courseName;
    private List<Student> students;

    public SchoolCourse(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Add student to course
    public void addStudent(Student student) {
        students.add(student);
    }

    // Show all enrolled students
    public void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}
