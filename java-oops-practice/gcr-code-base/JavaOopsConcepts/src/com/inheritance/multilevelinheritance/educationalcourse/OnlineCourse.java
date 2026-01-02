package com.inheritance.multilevelinheritance.educationalcourse;

public class OnlineCourse extends Course {
	 String platform;
	 boolean isRecorded;

	 OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
	     super(courseName, duration);
	     this.platform = platform;
	     this.isRecorded = isRecorded;
	 }

	 @Override
	 String getCourseDetails() {
	     return super.getCourseDetails() +
	            "\nPlatform: " + platform +
	            "\nRecorded: " + (isRecorded ? "Yes" : "No");
	}
}
