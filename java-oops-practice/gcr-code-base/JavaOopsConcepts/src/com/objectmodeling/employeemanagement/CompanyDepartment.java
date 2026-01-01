package com.objectmodeling.employeemanagement;
import java.util.ArrayList;
import java.util.List;

public class CompanyDepartment {
    private String departmentName;
    private List<CompanyEmployee> employees;

    public CompanyDepartment(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
        System.out.println("Department created: " + departmentName);
    }

    public void addEmployee(String name, int id) {
        employees.add(new CompanyEmployee(name, id));
    }

    public void showEmployees() {
        System.out.println("Employees in " + departmentName + ":");
        for (CompanyEmployee emp : employees) {
            emp.displayEmployee();
        }
    }

    public void closeDepartment() {
        System.out.println("Closing Department: " + departmentName);
        employees.clear(); // All employees removed
    }
}

