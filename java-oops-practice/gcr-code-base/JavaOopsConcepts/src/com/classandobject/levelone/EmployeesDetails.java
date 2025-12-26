package com.classandobject.levelone;

public class EmployeesDetails {

	//non-static variables
		String name;
		int id;
		double salary;
		
		//Constructor
		EmployeesDetails(String name, int id,double salary){
			this.name=name;
			this.id=id;
			this.salary=salary;
		}
		
		//creating method to display employee details
		public  void displayEmployee() {
			System.out.println("Employee Name: "+name);
			System.out.println("Employee id: "+id);
			System.out.println("Employee Salary: "+salary);
		}
		
		public static void main(String[] args) {
		EmployeesDetails emp=new EmployeesDetails("Rohan",1,500000);//calling constructor
		emp.displayEmployee();//calling the display method
		}


}
