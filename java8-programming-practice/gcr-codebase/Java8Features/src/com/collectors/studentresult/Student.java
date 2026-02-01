package com.collectors.studentresult;

public class Student {

	String name;
	char grade;

	public Student(String name, char grade) {

		this.name = name;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [ name=" + name + ", grade=" + grade + "]";
	}

}