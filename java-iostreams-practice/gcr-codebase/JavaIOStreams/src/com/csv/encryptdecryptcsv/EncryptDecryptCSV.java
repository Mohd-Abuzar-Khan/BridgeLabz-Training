package com.csv.encryptdecryptcsv;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

// Encrypts and decrypts sensitive CSV fields
public class EncryptDecryptCSV {

    private static final String ALGORITHM = "AES";
    private static final String SECRET_KEY = "MySecretKey12345"; // 16 bytes

    // Encrypts a string
    private static String encrypt(String value) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, keySpec);
        return Base64.getEncoder().encodeToString(cipher.doFinal(value.getBytes(StandardCharsets.UTF_8)));
    }

    // Decrypts a string
    private static String decrypt(String value) throws Exception {
        SecretKeySpec keySpec = new SecretKeySpec(SECRET_KEY.getBytes(StandardCharsets.UTF_8), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, keySpec);
        return new String(cipher.doFinal(Base64.getDecoder().decode(value)), StandardCharsets.UTF_8);
    }

    // Encrypt CSV sensitive columns (email and salary)
    public static void encryptCSV(String inputFile, String outputFile) {
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             FileWriter writer = new FileWriter(outputFile)) {

            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                if (line.isBlank()) continue;

                if (isHeader) {
                    writer.write(line + "\n");
                    isHeader = false;
                    continue;
                }

                String[] parts = line.split(",");
                if (parts.length < 4) {
                    System.err.println("Skipping invalid row: " + line);
                    continue;
                }

                String encryptedEmail = encrypt(parts[2].trim());
                String encryptedSalary = encrypt(parts[3].trim());

                writer.write(String.join(",", parts[0].trim(), parts[1].trim(), encryptedEmail, encryptedSalary) + "\n");
            }

            System.out.println("Encrypted CSV created: " + outputFile);

        } catch (Exception e) {
            System.err.println("Error encrypting CSV: " + e.getMessage());
        }
    }

    // Read CSV and decrypt sensitive columns
    public static void decryptCSV(String inputFile) {
        System.out.println("=== Decrypted CSV Data ===");
        System.out.println("----------------------------------------");

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            boolean isHeader = true;

            while ((line = br.readLine()) != null) {
                if (line.isBlank()) continue;

                if (isHeader) {
                    System.out.println("Header: " + line);
                    System.out.println("----------------------------------------");
                    isHeader = false;
                    continue;
                }

                String[] parts = line.split(",");
                if (parts.length < 4) {
                    System.err.println("Skipping invalid row: " + line);
                    continue;
                }

                String decryptedEmail = decrypt(parts[2].trim());
                String decryptedSalary = decrypt(parts[3].trim());

                System.out.printf("ID: %-5s | Name: %-15s | Email: %-25s | Salary: %-10s%n",
                        parts[0].trim(), parts[1].trim(), decryptedEmail, decryptedSalary);
            }

            System.out.println("----------------------------------------");

        } catch (Exception e) {
            System.err.println("Error decrypting CSV: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String inputFile = "src/com/csv/encryptdecryptcsv/employees.csv";
        String encryptedFile = "src/com/csv/encryptdecryptcsv/employees_encrypted.csv";

        System.out.println("=== Encrypting CSV Data ===");
        encryptCSV(inputFile, encryptedFile);

        System.out.println("\n=== Reading Decrypted CSV ===");
        decryptCSV(encryptedFile);
    }
}
