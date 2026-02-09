package com.bankingsystem;

import java.time.LocalDateTime;

// Shared bank account resource
class BankAccount {

    private int balance = 10000; // Initial balance

    // Withdraw money from the account
    public boolean withdraw(String customer, int amount) {

        System.out.println("[" + Thread.currentThread().getName() +
                "] Attempting to withdraw " + amount + " at " + LocalDateTime.now());

        // Check if balance is enough
        if (balance >= amount) {

            try {
                Thread.sleep(500); // Simulate processing delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            balance -= amount; // Deduct amount
            System.out.println("Transaction successful: " + customer +
                    ", Amount: " + amount + ", Balance: " + balance);
            return true;

        } else {
            System.out.println("Transaction failed: " + customer + ", Insufficient balance");
            return false;
        }
    }

    // Return current balance
    public int getBalance() {
        return balance;
    }
}
