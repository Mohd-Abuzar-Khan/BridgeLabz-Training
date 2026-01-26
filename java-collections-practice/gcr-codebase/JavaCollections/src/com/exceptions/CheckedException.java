package com.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Demonstrates handling of a checked exception while reading a file
public class CheckedException {

    public static void main(String[] args) {
        String fileName = "data.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            System.out.println("File contents:");
            System.out.println("==============");

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("\nFile read successfully");

        } catch (IOException exception) {
            System.out.println("File not found or cannot be read");
        }
    }
}
