package com.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Represents an employee that can be serialized
class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private final int id;
    private final String name;
    private final String department;
    private final double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return "Employee{id=" + id +
                ", name='" + name +
                "', department='" + department +
                "', salary=" + salary + "}";
    }
}

// Serializes and deserializes a list of employees
public class SerializationExample {

    public static void main(String[] args) {
        String fileName = "employees.dat";

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John Doe", "Engineering", 75000));
        employees.add(new Employee(2, "Jane Smith", "Marketing", 65000));
        employees.add(new Employee(3, "Bob Johnson", "HR", 60000));

        serializeEmployees(employees, fileName);

        List<Employee> result = deserializeEmployees(fileName);
        if (result != null) {
            System.out.println("\nRetrieved employees:");
            result.forEach(System.out::println);
        }
    }

    // Writes employee data to a file
    private static void serializeEmployees(List<Employee> employees, String fileName) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(employees);
            System.out.println("Employees saved to " + fileName);

        } catch (IOException exception) {
            System.err.println("Serialization error: " + exception.getMessage());
        }
    }

    // Reads employee data from a file
    @SuppressWarnings("unchecked")
    private static List<Employee> deserializeEmployees(String fileName) {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            System.out.println("Employees loaded from " + fileName);
            return (List<Employee>) ois.readObject();

        } catch (IOException | ClassNotFoundException exception) {
            System.err.println("Deserialization error: " + exception.getMessage());
            return null;
        }
    }
}
