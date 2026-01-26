package com.csv.sortcsvrecords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Sorts CSV records and prints top employees by salary
public class SortCSVRecords {

    public static void main(String[] args) {
        String csvFile = "src/com/csv/sortcsvrecords/employees.csv";
        int topN = 5;

        List<Employee> employees = loadEmployees(csvFile);
        sortBySalaryDescending(employees);
        printTopEmployees(employees, topN);
    }

    // Employee data class
    static class Employee {
        String id;
        String name;
        String department;
        double salary;

        Employee(String id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }

    // Loads employees from CSV file
    private static List<Employee> loadEmployees(String filePath) {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isHeader = true;

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                if (isHeader) {
                    isHeader = false;
                    continue;
                }

                String[] data = line.split(",");
                if (data.length < 4) continue;

                try {
                    double salary = Double.parseDouble(data[3].trim());
                    employees.add(new Employee(
                            data[0].trim(),
                            data[1].trim(),
                            data[2].trim(),
                            salary
                    ));
                } catch (NumberFormatException e) {
                    System.err.println("Skipping row with invalid salary: " + line);
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
        }

        return employees;
    }

    // Sorts employees by salary in descending order
    private static void sortBySalaryDescending(List<Employee> employees) {
        employees.sort(Comparator.comparingDouble((Employee e) -> e.salary).reversed());
    }

    // Prints top N employees
    private static void printTopEmployees(List<Employee> employees, int topN) {
        int count = Math.min(topN, employees.size());
        System.out.println("=== Top " + count + " Highest-Paid Employees ===");
        System.out.println("----------------------------------------");
        System.out.printf("%-5s | %-20s | %-15s | %-10s%n", "ID", "Name", "Department", "Salary");
        System.out.println("----------------------------------------");

        for (int i = 0; i < count; i++) {
            Employee e = employees.get(i);
            System.out.printf("%-5s | %-20s | %-15s | $%-10.2f%n",
                    e.id, e.name, e.department, e.salary);
        }

        System.out.println("----------------------------------------");
    }
}
