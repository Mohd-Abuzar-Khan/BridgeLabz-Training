package com.streams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// Converts an image to a byte array, writes it back, and verifies the result
public class ByteArrayStreamImage {

    public static void main(String[] args) {
        String sourceImage = "input.jpg";
        String outputImage = "output.jpg";

        try {
            byte[] imageBytes = readImageToByteArray(sourceImage);
            System.out.println("Image read. Size: " + imageBytes.length + " bytes");

            writeByteArrayToImage(imageBytes, outputImage);
            System.out.println("Image written to " + outputImage);

            boolean identical = verifyFilesAreIdentical(sourceImage, outputImage);
            System.out.println("Verification result: " + identical);

        } catch (IOException exception) {
            System.err.println("I/O error: " + exception.getMessage());
        }
    }

    // Reads an image file into a byte array
    private static byte[] readImageToByteArray(String fileName) throws IOException {
        try (FileInputStream fis = new FileInputStream(fileName);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            return baos.toByteArray();
        }
    }

    // Writes a byte array to an image file
    private static void writeByteArrayToImage(byte[] imageBytes, String fileName) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(fileName)) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    // Compares two files byte by byte
    private static boolean verifyFilesAreIdentical(String file1, String file2) throws IOException {
        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {

            int byte1;
            while ((byte1 = fis1.read()) != -1) {
                if (byte1 != fis2.read()) {
                    return false;
                }
            }
            return fis2.read() == -1;
        }
    }
}
