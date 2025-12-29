package com.javakeywords.levelone;

public class CompanyMain {

	public static void main(String[] args) {
	       // Set the company name (static variable)
	       Company.setCompanyName("Tech Solutions Inc.");
	       // Create new employee instances
	       Company emp1 = new Company("Thamarai", 101, "Software Engineer");
	      Company emp2 = new Company("Rohan", 102, "Project Manager");
	       // Display total number of employees
	       Company.displayTotalEmployees();
	       // Display employee details
	       emp1.displayEmployeeDetails();
	       emp2.displayEmployeeDetails();
	}
}