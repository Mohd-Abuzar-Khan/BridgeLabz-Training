package sorting.robowarehouse;

import java.util.ArrayList;

public class RoboWarehouse {

    // Method to sort package weights using Insertion Sort
    public static void insertionSort(ArrayList<Integer> weights) {

        for (int i = 1; i < weights.size(); i++) {
            int key = weights.get(i);
            int j = i - 1;

            // Shift heavier packages one position to the right
            while (j >= 0 && weights.get(j) > key) {
                weights.set(j + 1, weights.get(j));
                j--;
            }

            // Insert the package at its correct position
            weights.set(j + 1, key);
        }
    }

    public static void addPackage(int weight, ArrayList<Integer> shelf) {
        shelf.add(weight);
    }

    public static void main(String[] args) {

        ArrayList<Integer> shelf = new ArrayList<>();

        addPackage(22, shelf);
        addPackage(39, shelf);
        addPackage(24, shelf);
        addPackage(17, shelf);
        addPackage(42, shelf);

        // Apply insertion sort
        insertionSort(shelf);

        // Display sorted shelf
        for (int weight : shelf) {
            System.out.print(weight + " ");
        }
    }
}
