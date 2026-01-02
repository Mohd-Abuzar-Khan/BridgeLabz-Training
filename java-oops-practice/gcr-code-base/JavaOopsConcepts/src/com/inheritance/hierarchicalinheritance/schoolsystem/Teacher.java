package com.inheritance.hierarchicalinheritance.schoolsystem;

public class Teacher extends Person {
	String subject;
	
	Teacher(String name, int age, String subject){
		super(name, age);
		this.subject = subject;
	}
	
	public void displayRole() {
		System.out.println("Role of this person is Teacher");
		System.out.println("Subject they teach is " + subject);

	}
}
