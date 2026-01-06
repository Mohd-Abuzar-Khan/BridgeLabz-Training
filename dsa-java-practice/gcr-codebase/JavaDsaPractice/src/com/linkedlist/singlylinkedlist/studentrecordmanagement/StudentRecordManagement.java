package com.linkedlist.singlylinkedlist.studentrecordmanagement;

import java.util.Scanner;

public class StudentRecordManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();

        while (true) {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete by Roll No");
            System.out.println("5. Search by Roll No");
            System.out.println("6. Update Grade");
            System.out.println("7. Display All");
            System.out.println("8. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    list.addAtBeginning(1, "Aman", 20, 'A');
                    break;
                case 2:
                    list.addAtEnd(2, "Riya", 21, 'B');
                    break;
                case 3:
                    list.addAtPosition(2, 3, "Zary", 22, 'A');
                    break;
                case 4:
                    list.deleteByRollNo(2);
                    break;
                case 5:
                    list.searchByRollNo(1);
                    break;
                case 6:
                    list.updateGrade(1, 'A');
                    break;
                case 7:
                    list.displayAll();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

