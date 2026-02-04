package com.basicproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingAndAggeregation {
	public static void main(String[] args) {
		
		
		List<Student> students = new ArrayList<>();

		students.add(new Student("Rahul Sharma", 101, "Rahul", 21, "Male", "Delhi", 5, List.of(9876543210L, 9123456789L)));
		students.add(new Student("Ananya Verma", 102, "Ananya", 27, "Female", "Mumbai", 12, List.of(9123456789L, 9988776655L)));
		students.add(new Student("Amit Kumar Singh", 103, "Amit", 22, "Male", "Patna", 8, List.of(9988776655L, 9871203456L)));
		students.add(new Student("Priya Patel", 104, "Priya", 19, "Female", "Ahmedabad", 15, List.of(9012345678L, 9090909090L)));
		students.add(new Student("Rohit Mehta", 105, "Rohit", 23, "Male", "Bangalore", 3, List.of(9090909090L, 9567890123L)));

		students.add(new Student("Sneha Iyer", 106, "Sneha", 21, "Female", "Chennai", 10, List.of(9345678901L, 9654321098L)));
		students.add(new Student("Karan Malhotra", 107, "Karan", 27, "Male", "Delhi", 7, List.of(9567890123L, 9210987654L)));
		students.add(new Student("Neha Gupta", 108, "Neha", 20, "Female", "Mumbai", 18, List.of(9789012345L, 9432109876L)));
		students.add(new Student("Vikram Rao", 109, "Vikram", 29, "Male", "Hyderabad", 2, List.of(9871203456L, 9109876543L)));
		students.add(new Student("Pooja Chawla", 110, "Pooja", 21, "Female", "Mumbai", 14, List.of(9654321098L, 9098765432L)));

		students.add(new Student("Arjun Nair", 111, "Arjun", 26, "Male", "Kochi", 6, List.of(9898989898L, 9988001122L)));
		students.add(new Student("Riya Banerjee", 112, "Riya", 20, "Female", "Kolkata", 11, List.of(9765432109L, 8877665544L)));
		students.add(new Student("Siddharth Jain", 113, "Siddharth", 23, "Male", "Indore", 9, List.of(9543216789L, 9321098765L)));
		students.add(new Student("Kavya Reddy", 114, "Kavya", 29, "Female", "Mumbai", 16, List.of(9432109876L, 9098765432L)));
		students.add(new Student("Manish Yadav", 115, "Manish", 22, "Male", "Lucknow", 13, List.of(9321098765L, 9109876543L)));

		students.add(new Student("Ayesha Khan", 116, "Ayesha", 31, "Female", "Bhopal", 4, List.of(9210987654L, 9988776655L)));
		students.add(new Student("Harsh Vardhan", 117, "Harsh", 34, "Male", "Mumbai", 1, List.of(9109876543L, 9876543210L)));
		students.add(new Student("Nikita Kulkarni", 118, "Nikita", 20, "Female", "Pune", 17, List.of(9098765432L, 9345678901L)));
		students.add(new Student("Aditya Mishra", 119, "Aditya", 22, "Male", "Prayagraj", 19, List.of(9988001122L, 9543216789L)));
		students.add(new Student("Shalini Saxena", 120, "Shalini", 21, "Female", "Gwalior", 20, List.of(8877665544L, 9012345678L)));


		
		
		// Count the number of students in each city.
		System.out.println(students.stream().collect(Collectors.groupingBy(x -> x.city, Collectors.counting())));

		// Find the average age of students in each city.
		System.out.println(students.stream().collect(Collectors.groupingBy(x -> x.city, Collectors.averagingLong(x -> x.age))));

		// Find the average rank of students by gender.
		System.out.println(students.stream().collect(Collectors.groupingBy(x -> x.gender, Collectors.averagingLong(x -> x.rank))));

		// Find the total number of students in the organization.
		System.out.println(students.stream().collect(Collectors.counting()));

		//Find the department with the highest average rank.

		students.stream().collect(Collectors.groupingBy(
			                    x -> x.city,
			                    Collectors.averagingInt(x -> x.rank)
			            ))
			            .entrySet()
			            .stream()
			            .sorted(Map.Entry.comparingByValue())
			            .forEach(System.out::println);

		

	}
}
