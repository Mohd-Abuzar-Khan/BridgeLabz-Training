package com.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Reads a text file and writes its contents to another file
public class FileHandling {

    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println(
                    "File copied from " + sourceFile + " to " + destinationFile
            );

        } catch (IOException exception) {
            System.err.println("File operation failed: " + exception.getMessage());
        }
    }
}
