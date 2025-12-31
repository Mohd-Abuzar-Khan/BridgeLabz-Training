package com.objectmodeling.levelone;
public class CompanyMain {
    public static void main(String[] args) {

        // Creating company object
        Company company = new Company("Capgemini");

        // Creating departments
        CompanyDepartment dev = new CompanyDepartment("Development");
        CompanyDepartment hr = new CompanyDepartment("HR");

        // Adding employees to departments
        dev.addEmployee("Abuzar", 101);
        dev.addEmployee("Laxmi", 102);
        hr.addEmployee("Arif", 201);

        // Adding departments to company
        company.addDepartment(dev);
        company.addDepartment(hr);

        // Display full structure
        company.showCompanyStructure();

        // Closing the company (composition effect)
        company.closeCompany();
    }
}

