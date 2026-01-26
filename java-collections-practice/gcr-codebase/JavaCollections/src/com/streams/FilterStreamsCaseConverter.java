package com.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Converts all text in a file from uppercase to lowercase
public class FilterStreamsCaseConverter {

    public static void main(String[] args) {
        String sourceFile = "input.txt";
        String outputFile = "output_lowercase.txt";

        try {
            convertToLowercase(sourceFile, outputFile);
            System.out.println("File converted and saved to " + outputFile);

        } catch (IOException exception) {
            System.err.println("Conversion failed: " + exception.getMessage());
        }
    }

    // Reads text from one file, converts it to lowercase, and writes it to another file
    private static void convertToLowercase(String source, String dest)
            throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader(source));
             BufferedWriter writer = new BufferedWriter(new FileWriter(dest))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }
        }
    }
}
