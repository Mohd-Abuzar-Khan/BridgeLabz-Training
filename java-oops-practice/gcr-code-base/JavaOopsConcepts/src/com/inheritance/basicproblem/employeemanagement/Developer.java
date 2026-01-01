package com.inheritance.basicproblem.employeemanagement;

public class Developer extends Employee {
    String Role;

    public Developer(String name, int id, int salary, String Role) {
        super(name, id, salary);
        this.Role = Role;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Developer Role " + Role);
    }
}
