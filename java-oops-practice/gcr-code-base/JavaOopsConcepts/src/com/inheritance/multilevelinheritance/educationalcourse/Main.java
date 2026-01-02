package com.inheritance.multilevelinheritance.educationalcourse;

public class Main {
	 public static void main(String[] args) {

	     PaidOnlineCourse course = new PaidOnlineCourse(
	             "Full Stack Web Development",
	             120,
	             "Udemy",
	             true,
	             9999,
	             2000
	     );

	     System.out.println(course.getCourseDetails());
	 }
}