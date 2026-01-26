package com.streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Writes and reads student data using data streams
public class DataStreamsStudent {

    public static void main(String[] args) {
        String fileName = "students.dat";

        writeStudentData(fileName);
        readStudentData(fileName);
    }

    // Stores student records in a binary file
    private static void writeStudentData(String fileName) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {

            dos.writeInt(101);
            dos.writeUTF("Alice Johnson");
            dos.writeDouble(3.85);

            dos.writeInt(102);
            dos.writeUTF("Bob Williams");
            dos.writeDouble(3.92);

            dos.writeInt(103);
            dos.writeUTF("Charlie Brown");
            dos.writeDouble(3.78);

            System.out.println("Student data written to " + fileName);

        } catch (IOException exception) {
            System.err.println("Write error: " + exception.getMessage());
        }
    }

    // Reads student records from a binary file
    private static void readStudentData(String fileName) {
        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream(fileName))) {

            System.out.println("\nRetrieved student data:");
            System.out.println("=======================");

            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll Number: " + rollNumber);
                System.out.println("Name: " + name);
                System.out.println("GPA: " + gpa);
                System.out.println("---");
            }

        } catch (IOException exception) {
            System.err.println("Read error: " + exception.getMessage());
        }
    }
}
