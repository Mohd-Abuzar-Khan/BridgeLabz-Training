package com.streams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

// Reads user input from the console and saves it to a file
public class ReadUserInput {

    public static void main(String[] args) {
        String fileName = "user_info.txt";

        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(fileName)) {

            System.out.print("Enter your name: ");
            String name = reader.readLine();

            System.out.print("Enter your age: ");
            String age = reader.readLine();

            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();

            writer.write("User Information\n");
            writer.write("================\n");
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Programming Language: " + language + "\n");

            System.out.println("\nInformation saved to " + fileName);

        } catch (IOException exception) {
            System.err.println("Input or file error: " + exception.getMessage());
        }
    }
}
