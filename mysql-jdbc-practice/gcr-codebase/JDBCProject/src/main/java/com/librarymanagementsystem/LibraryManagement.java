package com.librarymanagementsystem;

import java.sql.*;

public class LibraryManagement implements AutoCloseable {

    private Connection connection;

    private PreparedStatement addBookStatement;
    private PreparedStatement addStudentStatement;
    private CallableStatement borrowBookStatement;
    private CallableStatement searchBookStatement;
    private PreparedStatement returnBookStatement;
    private PreparedStatement fineStatement;

    public LibraryManagement() throws SQLException {

        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/library_system",
                "Z4RY",
                "ABmysql14"
        );

        addBookStatement = connection.prepareStatement(
                "INSERT INTO books (title, author, category, total_copies, available_copies) VALUES (?, ?, ?, ?, ?)"
        );

        addStudentStatement = connection.prepareStatement(
                "INSERT INTO student (name, email) VALUES (?, ?)"
        );

        borrowBookStatement = connection.prepareCall(
                "{CALL borrow_book(?, ?, ?)}"
        );

        searchBookStatement = connection.prepareCall(
                "{CALL search_books(?, ?, ?, ?)}"
        );

        returnBookStatement = connection.prepareStatement(
                "UPDATE borrow_records SET return_date = CURDATE() WHERE book_id = ? AND student_id = ?"
        );

        fineStatement = connection.prepareStatement(
                "SELECT DATEDIFF(CURDATE(), due_date) AS overdue_days FROM borrow_records WHERE book_id = ? AND student_id = ? AND return_date IS NULL"
        );
    }

    public void addBook(String title, String author, String category,
                        int totalCopies) throws SQLException {

        addBookStatement.setString(1, title);
        addBookStatement.setString(2, author);
        addBookStatement.setString(3, category);
        addBookStatement.setInt(4, totalCopies);
        addBookStatement.setInt(5, totalCopies);

        addBookStatement.executeUpdate();
    }

    public void addStudent(String name, String email) throws SQLException {

        addStudentStatement.setString(1, name);
        addStudentStatement.setString(2, email);
        addStudentStatement.executeUpdate();
    }

    public void borrowBook(int studentId, int bookId, int days)
            throws SQLException {

        borrowBookStatement.setInt(1, studentId);
        borrowBookStatement.setInt(2, bookId);
        borrowBookStatement.setInt(3, days);

        borrowBookStatement.execute();
    }

    public void searchBooks(String title, String author,
                            String category, boolean availableOnly)
            throws SQLException {

        searchBookStatement.setString(1, title);
        searchBookStatement.setString(2, author);
        searchBookStatement.setString(3, category);
        searchBookStatement.setBoolean(4, availableOnly);

        ResultSet rs = searchBookStatement.executeQuery();

        while (rs.next()) {
            System.out.println(
                    rs.getInt("book_id") + " | " +
                    rs.getString("title") + " | " +
                    rs.getString("author") + " | " +
                    rs.getString("category")
            );
        }
    }

    public void calculateFine(int bookId, int studentId)
            throws SQLException {

        fineStatement.setInt(1, bookId);
        fineStatement.setInt(2, studentId);

        ResultSet rs = fineStatement.executeQuery();

        if (rs.next()) {
            int overdueDays = rs.getInt("overdue_days");

            if (overdueDays > 0) {
                double fine = overdueDays * 5;
                System.out.println("Fine: ₹" + fine);
            } else {
                System.out.println("No fine.");
            }
        }
    }

    public void returnBook(int bookId, int studentId)
            throws SQLException {

        returnBookStatement.setInt(1, bookId);
        returnBookStatement.setInt(2, studentId);

        returnBookStatement.executeUpdate();

        PreparedStatement updateCopies = connection.prepareStatement(
                "UPDATE books SET available_copies = available_copies + 1 WHERE book_id = ?"
        );

        updateCopies.setInt(1, bookId);
        updateCopies.executeUpdate();
        updateCopies.close();
    }

    @Override
    public void close() throws SQLException {

        addBookStatement.close();
        addStudentStatement.close();
        borrowBookStatement.close();
        searchBookStatement.close();
        returnBookStatement.close();
        fineStatement.close();
        connection.close();
    }
}