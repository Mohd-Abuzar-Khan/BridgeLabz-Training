package com.employeemanagement;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (EmployeeManagementSystem ms = new EmployeeManagementSystem();
             Scanner sc = new Scanner(System.in)) {

            System.out.println("Employee Management System");

            while (true) {

                System.out.println("""
                        
1. Add Employee
2. View All Employees
3. Update Employee Salary
4. Delete Employee
5. Search Employee by Name
6. Exit
""");

                System.out.print("Choose an option: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                    case 1 -> {
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter email: ");
                        String email = sc.nextLine();

                        System.out.print("Enter department: ");
                        String department = sc.nextLine();

                        System.out.print("Enter salary: ");
                        double salary = sc.nextDouble();
                        sc.nextLine();

                        try {
                            ms.addEmployee(name, email, department, salary);
                            System.out.println("Employee added successfully.");
                        } catch (SQLIntegrityConstraintViolationException e) {
                            System.out.println("Email already exists. Cannot insert duplicate.");
                        }
                    }

                    case 2 -> ms.viewAllEmployees();

                    case 3 -> {
                        System.out.print("Enter employee ID: ");
                        int idToUpdate = sc.nextInt();

                        System.out.print("Enter new salary: ");
                        double newSalary = sc.nextDouble();
                        sc.nextLine();

                        if (ms.updateEmployeeSalary(idToUpdate, newSalary)) {
                            System.out.println("Employee salary updated successfully.");
                        } else {
                            System.out.println("Employee not found.");
                        }
                    }

                    case 4 -> {
                        System.out.print("Enter employee ID: ");
                        int idToDelete = sc.nextInt();
                        sc.nextLine();

                        if (ms.deleteEmployee(idToDelete)) {
                            System.out.println("Employee deleted successfully.");
                        } else {
                            System.out.println("Employee not found.");
                        }
                    }

                    case 5 -> {
                        System.out.print("Enter name to search: ");
                        String nameToSearch = sc.nextLine();

                        ms.searchEmployeeByName(nameToSearch);
                    }

                    case 6 -> {
                        System.out.println("Exiting...");
                        return;
                    }

                    default -> System.out.println("Invalid option. Please try again.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}