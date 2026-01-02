package com.objectmodeling.universitymanagement;
import java.util.ArrayList;
import java.util.List;

// Represents the University which manages students, professors, and courses
public class University {

    private String name;

    // List of students in the university
    private List<Student> students;

    // List of professors in the university
    private List<Professor> professors;

    // List of courses offered by the university
    private List<Course> courses;

    // Constructor to initialize university details
    public University(String name) {
        this.name = name;
        students = new ArrayList<>();
        professors = new ArrayList<>();
        courses = new ArrayList<>();
    }

    // Adds a student to the university
    public void addStudent(Student student) {
        students.add(student);
    }

    // Adds a professor to the university
    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    // Adds a course to the university
    public void addCourse(Course course) {
        courses.add(course);
    }
}
