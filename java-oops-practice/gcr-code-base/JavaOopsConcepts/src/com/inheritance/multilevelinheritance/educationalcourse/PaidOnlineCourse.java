package com.inheritance.multilevelinheritance.educationalcourse;

public class PaidOnlineCourse extends OnlineCourse {
	 double fee;
	 double discount;

	 PaidOnlineCourse(String courseName, int duration, String platform,
	                  boolean isRecorded, double fee, double discount) {
	     super(courseName, duration, platform, isRecorded);
	     this.fee = fee;
	     this.discount = discount;
	 }

	 @Override
	 String getCourseDetails() {
	     double finalPrice = fee - discount;
	     return super.getCourseDetails() +
	            "\nCourse Fee: ₹" + fee +
	            "\nDiscount: ₹" + discount +
	            "\nFinal Price: ₹" + finalPrice;
	 }
}
