package com.objectmodeling.universitymanagement;
import java.util.ArrayList;
import java.util.List;

// Represents a course in the university
public class Course {

    // Course ID
    private int courseId;

    // Course name
    private String courseName;

    // Professor teaching this course
    private Professor professor;

    // List of students enrolled in this course
    private List<Student> students;

    // Constructor to initialize course details
    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Adds a student to the course
    public void addStudent(Student student) {
        students.add(student);
    }

    // Assigns a professor to the course
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    // Getter for course name
    public String getCourseName() {
        return courseName;
    }
}
