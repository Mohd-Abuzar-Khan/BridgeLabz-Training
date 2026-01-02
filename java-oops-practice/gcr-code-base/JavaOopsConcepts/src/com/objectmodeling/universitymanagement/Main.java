package com.objectmodeling.universitymanagement;

public class Main {
    public static void main(String[] args) {

        // Create university
        University uni = new University("Tech University");

        // Create students
        Student s1 = new Student(1, "Abuzar");
        Student s2 = new Student(2, "Ananya");

        // Create professor
        Professor p1 = new Professor(101, "Prof. Jorawansi");

        // Create courses
        Course c1 = new Course(201, "Data Structures");
        Course c2 = new Course(202, "Operating Systems");

        // Add entities to university
        uni.addStudent(s1);
        uni.addStudent(s2);
        uni.addProfessor(p1);
        uni.addCourse(c1);
        uni.addCourse(c2);

        // Assign professor to courses
        p1.assignCourse(c1);
        p1.assignCourse(c2);

        // Enroll students in courses
        s1.enrollCourse(c1);
        s2.enrollCourse(c2);
    }
}
