package com.methodrefrencing.employeename;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class EmployeeName {
	
	public static void main(String[] args) {
		
		List<Employee> listOfEmployee = new ArrayList<>();
		
		listOfEmployee.add(new Employee("Abuzar", 9832));
		listOfEmployee.add(new Employee("Ananya", 9534));
		listOfEmployee.add(new Employee("Laxmi", 7453));
		listOfEmployee.add(new Employee("Naman", 8236));
		
		Consumer<Employee> name = (x) -> System.out.println(x.name.toUpperCase());
		
		listOfEmployee.stream().forEach(name);;
		
		System.out.println("-------------------->");
		
		Stream<Employee> str = listOfEmployee.stream(); 
		
		str.map(Employee::getName).map(String::toUpperCase).forEach(System.out::println);
	

	}
}
