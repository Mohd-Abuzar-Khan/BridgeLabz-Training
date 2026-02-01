package com.collectors.employeesalary;

public class Employee {

	String name;
	protected int salary;
	protected String department;

	public Employee(String name, String department,  int salary) {

		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

	public int getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

}