package com.basicproblem;

import java.util.ArrayList;
import java.util.List;

public class Student {
	 String name;
	 int id;
	 String firstName;
	 int age;
	 String gender;
	 String city;
	 int rank;
	 List<Long> contact = new ArrayList<>();
	
	public Student(String name, int id, String firstName, int age, String gender, String city, int rank, List<Long> contact) {
		this.name = name;
		this.id = id;
		this.firstName = firstName;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.rank = rank;
		this.contact = contact;
	}
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getCity() {
		return city;
	}

	public int getRank() {
		return rank;
	}

	public List<Long> getContact() {
		return contact;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public void setContact(List<Long> contact) {
		this.contact = contact;
	}

	public void printDetails() {
		System.out.println(name + " " + id + " " + age + " " + gender + " " + city + " " + rank);
	}
	
	

}
