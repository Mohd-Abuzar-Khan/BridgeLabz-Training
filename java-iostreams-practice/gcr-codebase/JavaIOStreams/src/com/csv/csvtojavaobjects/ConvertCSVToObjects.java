package com.csv.csvtojavaobjects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConvertCSVToObjects {

    // Reads student data from a CSV file and converts each valid row into a Student object
    private static final String CSV_FILE_PATH =
            "src/com/csv/csvtojavaobjects/students.csv";

    public static void main(String[] args) {
        List<Student> students = readStudentsFromCsv(CSV_FILE_PATH);
        printStudents(students);
    }

    private static List<Student> readStudentsFromCsv(String filePath) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean skipHeader = true;
            while ((line = reader.readLine()) != null) {
                if (skipHeader) {
                    skipHeader = false;
                    continue;
                }
                Student student = parseStudent(line);
                if (student != null) {
                    students.add(student);
                }
            }
        } catch (IOException e) {
            System.err.println("Failed to read CSV file: " + e.getMessage());
        }
        return students;
    }

    // Prints all loaded Student objects to the console
    private static Student parseStudent(String line) {
        String[] data = line.split(",");
        if (data.length != 4) {
            return null;
        }
        try {
            int id = Integer.parseInt(data[0].trim());
            String name = data[1].trim();
            int age = Integer.parseInt(data[2].trim());
            double marks = Double.parseDouble(data[3].trim());
            return new Student(id, name, age, marks);
        } catch (NumberFormatException e) {
            System.err.println("Invalid data format: " + line);
            return null;
        }
    }

    private static void printStudents(List<Student> students) {
        System.out.println("=== Student Objects ===");
        System.out.println("Total students: " + students.size());
        System.out.println("----------------------------------------");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------------------------------------");
    }
}
