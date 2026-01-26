package com.exceptions;

import java.util.Scanner;

// Thrown when a withdrawal exceeds the available balance
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Represents a simple bank account
class BankAccount {

    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }

    // Withdraws an amount from the account
    public void withdraw(double amount)
            throws InsufficientBalanceException, IllegalArgumentException {

        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }

        balance -= amount;
    }
}

// Handles user interaction and transaction flow
public class BankTransactionSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000.0);
        System.out.println("Initial balance: $" + account.getBalance());

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter withdrawal amount: ");
            double amount = scanner.nextDouble();

            account.withdraw(amount);
            System.out.println(
                    "Withdrawal successful. New balance: $" + account.getBalance()
            );

        } catch (InsufficientBalanceException exception) {
            System.out.println("Insufficient balance");

        } catch (IllegalArgumentException exception) {
            System.out.println("Invalid amount");

        } catch (Exception exception) {
            System.out.println("Transaction failed: " + exception.getMessage());
        }
    }
}
