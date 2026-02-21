package com.employeemanagement;

import java.sql.*;

public class EmployeeManagementSystem implements AutoCloseable {

    private Connection conn;

    private PreparedStatement addEmployeeStmt;
    private PreparedStatement viewAllStmt;
    private PreparedStatement updateSalaryStmt;
    private PreparedStatement deleteEmployeeStmt;
    private PreparedStatement searchByNameStmt;

    public EmployeeManagementSystem() throws SQLException {

        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employee_db",
                "Z4RY",
                "ABmysql14"
        );

        addEmployeeStmt = conn.prepareStatement(
                "INSERT INTO employees (name, email, department, salary) VALUES (?, ?, ?, ?)"
        );

        viewAllStmt = conn.prepareStatement(
                "SELECT id, name, email, department, salary, created_at FROM employees"
        );

        updateSalaryStmt = conn.prepareStatement(
                "UPDATE employees SET salary = ? WHERE id = ?"
        );

        deleteEmployeeStmt = conn.prepareStatement(
                "DELETE FROM employees WHERE id = ?"
        );

        searchByNameStmt = conn.prepareStatement(
                "SELECT * FROM employees WHERE name LIKE ?"
        );
    }

    public void addEmployee(String name, String email,
                            String department, double salary)
            throws SQLException {

        addEmployeeStmt.setString(1, name);
        addEmployeeStmt.setString(2, email);
        addEmployeeStmt.setString(3, department);
        addEmployeeStmt.setDouble(4, salary);

        addEmployeeStmt.executeUpdate();
    }

    public void viewAllEmployees() throws SQLException {

        ResultSet rs = viewAllStmt.executeQuery();

        while (rs.next()) {
            System.out.println(
                    "ID: " + rs.getInt("id") +
                    ", Name: " + rs.getString("name") +
                    ", Email: " + rs.getString("email") +
                    ", Department: " + rs.getString("department") +
                    ", Salary: " + rs.getDouble("salary") +
                    ", Created At: " + rs.getTimestamp("created_at")
            );
        }
    }

    public boolean updateEmployeeSalary(int id, double newSalary)
            throws SQLException {

        updateSalaryStmt.setDouble(1, newSalary);
        updateSalaryStmt.setInt(2, id);

        return updateSalaryStmt.executeUpdate() > 0;
    }

    public boolean deleteEmployee(int id)
            throws SQLException {

        deleteEmployeeStmt.setInt(1, id);

        return deleteEmployeeStmt.executeUpdate() > 0;
    }

    public void searchEmployeeByName(String name)
            throws SQLException {

        searchByNameStmt.setString(1, "%" + name + "%");

        ResultSet rs = searchByNameStmt.executeQuery();

        while (rs.next()) {
            System.out.println(
                    "ID: " + rs.getInt("id") +
                    ", Name: " + rs.getString("name") +
                    ", Email: " + rs.getString("email") +
                    ", Department: " + rs.getString("department") +
                    ", Salary: " + rs.getDouble("salary")
            );
        }
    }

    @Override
    public void close() throws SQLException {

        addEmployeeStmt.close();
        viewAllStmt.close();
        updateSalaryStmt.close();
        deleteEmployeeStmt.close();
        searchByNameStmt.close();
        conn.close();
    }
}