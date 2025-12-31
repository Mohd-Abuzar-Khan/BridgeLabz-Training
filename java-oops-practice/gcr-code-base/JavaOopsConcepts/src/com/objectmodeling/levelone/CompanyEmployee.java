package com.objectmodeling.levelone;

public class CompanyEmployee {
    private String name;
    private int id;

    public CompanyEmployee(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println("Employee created: " + name);
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}