package com.objectmodeling.coursemanagement;

import java.util.ArrayList;
import java.util.List;

// School class has aggregation relationship with Student
public class School {

    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Add student to school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display all students in the school
    public void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

