package com.inheritance.multilevelinheritance.educationalcourse;

//Base class
public class Course {
 String courseName;
 int duration; // in hours

 Course(String courseName, int duration) {
     this.courseName = courseName;
     this.duration = duration;
 }

 String getCourseDetails() {
     return "Course Name: " + courseName +
            "\nDuration: " + duration + " hours";
 }
}
