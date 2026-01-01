package com.objectmodeling.employeemanagement;
import java.util.ArrayList;
import java.util.List;

// Company class represents the top-level entity
// It owns all Department objects (composition)
public class Company {

    private String companyName;
    private List<CompanyDepartment> departments;

    // Constructor initializes company and department list
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
        System.out.println("Company created: " + companyName);
    }

    // Adds a department to the company
    public void addDepartment(CompanyDepartment department) {
        departments.add(department);
    }

    // Displays full company structure
    public void showCompanyStructure() {
        System.out.println("\nCompany: " + companyName);
        System.out.println("-------------------------->");
        for (CompanyDepartment dept : departments) {
            dept.showEmployees();
        }
    }

    // When company is closed, all departments and employees are destroyed
    public void closeCompany() {
        System.out.println("\nClosing Company: " + companyName);

        for (CompanyDepartment dept : departments) {
            dept.closeDepartment();
        }

        departments.clear(); // remove all departments
        System.out.println("All departments and employees removed.");
    }
}

