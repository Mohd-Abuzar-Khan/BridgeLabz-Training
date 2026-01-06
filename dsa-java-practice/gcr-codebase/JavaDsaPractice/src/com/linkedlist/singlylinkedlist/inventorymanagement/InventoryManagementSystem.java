package com.linkedlist.singlylinkedlist.inventorymanagement;

public class InventoryManagementSystem {

    public static void main(String[] args) {

        InventoryLinkedList inventory = new InventoryLinkedList();

        // 🔹 Adding items
        inventory.addAtBeginning(101, "Laptop", 5, 55000.0);
        inventory.addAtEnd(102, "Mouse", 20, 500.0);
        inventory.addAtEnd(103, "Keyboard", 15, 1200.0);
        inventory.addAtPosition(2, 104, "Monitor", 7, 12000.0);

        System.out.println("Initial Inventory:");
        inventory.displayInventory();

        // 🔹 Search operations
        System.out.println("Search by Item ID (102):");
        inventory.searchById(102);

        System.out.println("Search by Item Name (Keyboard):");
        inventory.searchByName("Keyboard");

        // 🔹 Update quantity
        System.out.println("Updating Quantity of Item ID 101:");
        inventory.updateQuantity(101, 10);
        inventory.searchById(101);

        // 🔹 Remove item
        System.out.println("Removing Item ID 102:");
        inventory.removeByItemId(102);
        inventory.displayInventory();



        System.out.println("\n✅ Inventory Management System Execution Complete.");
    }
}
