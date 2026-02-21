package com.librarymanagementsystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (LibraryManagement library = new LibraryManagement();
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Welcome to the Library Management System");

            while (true) {

                System.out.println("\n1. Add Book");
                System.out.println("2. Add Student");
                System.out.println("3. Borrow Book");
                System.out.println("4. Search Books");
                System.out.println("5. Calculate Fine");
                System.out.println("6. Return Book");
                System.out.println("7. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {

                    case 1 -> {
                        System.out.print("Enter book title: ");
                        String title = scanner.nextLine();

                        System.out.print("Enter author name: ");
                        String author = scanner.nextLine();

                        System.out.print("Enter category: ");
                        String category = scanner.nextLine();

                        System.out.print("Enter total copies: ");
                        int copies = scanner.nextInt();
                        scanner.nextLine();

                        library.addBook(title, author, category, copies);
                        System.out.println("Book added successfully!");
                    }

                    case 2 -> {
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter email: ");
                        String email = scanner.nextLine();

                        library.addStudent(name, email);
                        System.out.println("Student added successfully!");
                    }

                    case 3 -> {
                        System.out.print("Enter student ID: ");
                        int studentId = scanner.nextInt();

                        System.out.print("Enter book ID: ");
                        int bookId = scanner.nextInt();

                        System.out.print("Enter number of days: ");
                        int days = scanner.nextInt();
                        scanner.nextLine();

                        library.borrowBook(studentId, bookId, days);
                        System.out.println("Book borrowed successfully!");
                    }

                    case 4 -> {
                        System.out.print("Enter title (or press Enter for NULL): ");
                        String title = scanner.nextLine();
                        if (title.isBlank()) title = null;

                        System.out.print("Enter author (or press Enter for NULL): ");
                        String author = scanner.nextLine();
                        if (author.isBlank()) author = null;

                        System.out.print("Enter category (or press Enter for NULL): ");
                        String category = scanner.nextLine();
                        if (category.isBlank()) category = null;

                        System.out.print("Available only? (true/false): ");
                        boolean availableOnly = scanner.nextBoolean();
                        scanner.nextLine();

                        library.searchBooks(title, author, category, availableOnly);
                    }

                    case 5 -> {
                        System.out.print("Enter book ID: ");
                        int bookId = scanner.nextInt();

                        System.out.print("Enter student ID: ");
                        int studentId = scanner.nextInt();
                        scanner.nextLine();

                        library.calculateFine(bookId, studentId);
                    }

                    case 6 -> {
                        System.out.print("Enter book ID: ");
                        int bookId = scanner.nextInt();

                        System.out.print("Enter student ID: ");
                        int studentId = scanner.nextInt();
                        scanner.nextLine();

                        library.returnBook(bookId, studentId);
                        System.out.println("Book returned successfully!");
                    }

                    case 7 -> {
                        System.out.println("Exiting the system. Goodbye!");
                        return;
                    }

                    default -> System.out.println("Invalid choice. Try again.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}