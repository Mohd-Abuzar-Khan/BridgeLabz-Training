package com.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Demonstrates try-with-resources for auto-closing BufferedReader
public class TryWithResources {

    public static void main(String[] args) {
        String fileName = "info.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String firstLine = reader.readLine();

            if (firstLine != null) {
                System.out.println("First line of the file:");
                System.out.println(firstLine);
            } else {
                System.out.println("File is empty");
            }

        } catch (IOException exception) {
            System.out.println("Error reading file");
        }
    }
}
