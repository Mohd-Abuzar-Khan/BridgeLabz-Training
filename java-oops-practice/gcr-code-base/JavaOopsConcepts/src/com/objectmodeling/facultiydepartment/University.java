package com.objectmodeling.facultiydepartment;

import java.util.ArrayList;
import java.util.List;

// Represents a University
public class University {

    private String name;

    // Composition: Departments cannot exist without University
    private List<Department> departments;

    // Aggregation: Faculty can exist independently
    private List<Faculty> facultyMembers;

    // Constructor
    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    // Add department (composition)
    public void addDepartment(Department dept) {
        departments.add(dept);
        System.out.println(dept.getDeptName() + " department added to " + name);
    }

    // Add faculty (aggregation)
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
        System.out.println(faculty.getName() + " joined " + name);
    }

    // Deleting the university destroys all departments
    public void closeUniversity() {
        System.out.println("\nClosing University: " + name);

        for (Department dept : departments) {
            dept.closeDepartment();
        }

        departments.clear();
        System.out.println("All departments removed.");

        // Faculty still exist (aggregation)
        System.out.println("Faculty members still exist independently.");
    }
}
