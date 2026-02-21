package com.bankingsysetm;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (ManagementSystem managementSystem = new ManagementSystem(); Scanner scanner = new Scanner(System.in)) {
			System.out.println("Welcome to the Banking System");
			while (true) {
				System.out.println("1. Add Account");
				System.out.println("2. Transfer Funds");
				System.out.println("3. Check Balance");
				System.out.println("4. View Transactions History");
				System.out.println("5. Exit");
				System.out.print("Choose an option: ");
				int choice = scanner.nextInt();
				scanner.nextLine();

				switch (choice) {
				case 1 -> {
					System.out.print("Enter account holder name: ");
					String name = scanner.nextLine();
					System.out.print("Enter initial balance: ");
					double initialBalance = scanner.nextDouble();
					managementSystem.addAccount(name, initialBalance);
					System.out.println("Account added successfully!");
				}
				case 2 -> {
					System.out.print("Enter sender account ID: ");
					int senderId = scanner.nextInt();
					System.out.print("Enter receiver account ID: ");
					int receiverId = scanner.nextInt();
					System.out.print("Enter amount to transfer: ");
					double amount = scanner.nextDouble();
					managementSystem.transferFunds(senderId, receiverId, amount);
					
				}
				case 3 -> {
					System.out.print("Enter account ID: ");
					int accountId = scanner.nextInt();
					managementSystem.checkBalance(accountId);
					break;
				}
				case 4 -> {
					System.out.print("Enter account ID: ");
					int accountId = scanner.nextInt();
					managementSystem.viewTransactionHistory(accountId);
				}
				case 5 -> {
					System.out.println("Exiting the system. Goodbye!");
					return;
				}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}