package com.collectors.employeesalary;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalary {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Zary", "IT", 80000));
        employees.add(new Employee("Alex", "HR", 50000));
        employees.add(new Employee("John", "IT", 90000));
        employees.add(new Employee("Sara", "HR", 60000));

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                         .collect(Collectors.groupingBy(
                             e -> e.department,
                             Collectors.averagingDouble(e -> e.salary)
                         ));

        System.out.println("Average salary by department:");
        System.out.println(avgSalaryByDept);
    }
}

