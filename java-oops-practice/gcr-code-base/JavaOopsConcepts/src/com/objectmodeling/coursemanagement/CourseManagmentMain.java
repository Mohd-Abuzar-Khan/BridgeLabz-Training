package com.objectmodeling.coursemanagement;

public class CourseManagmentMain {
    public static void main(String[] args) {

        // Create school
        School school = new School("Anand Vihar High School");

        // Create students
        Student s1 = new Student("Nageshwar", 101);
        Student s2 = new Student("Shilpa", 102);

        // Create courses
        SchoolCourse math = new SchoolCourse("Mathematics");
        SchoolCourse science = new SchoolCourse("Science");

        // Add students to school (Aggregation)
        school.addStudent(s1);
        school.addStudent(s2);

        // Enroll students in courses (Association)
        s1.enrollCourse(math);
        s1.enrollCourse(science);

        s2.enrollCourse(science);

        // Display data
        school.showStudents();
        System.out.println();

        s1.viewCourses();
        s2.viewCourses();

        System.out.println();

        math.showStudents();
        science.showStudents();
    }
}
