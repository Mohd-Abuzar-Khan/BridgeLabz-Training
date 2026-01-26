package com.exceptions;

import java.util.Scanner;

// Demonstrates multiple catch blocks for array operations
public class MultipleCatchBlocks {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter array size: ");
            int size = scanner.nextInt();

            int[] array = new int[size];

            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.print("Enter index to retrieve: ");
            int index = scanner.nextInt();

            int value = getValueAtIndex(array, index);
            System.out.println("Value at index " + index + ": " + value);

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Invalid index");

        } catch (NullPointerException exception) {
            System.out.println("Array is not initialized");

        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
        }
    }

    // Returns value at specified index, throws NullPointerException if array is null
    private static int getValueAtIndex(int[] array, int index) {
        if (array == null) {
            throw new NullPointerException("Array is null");
        }
        return array[index];
    }
}
