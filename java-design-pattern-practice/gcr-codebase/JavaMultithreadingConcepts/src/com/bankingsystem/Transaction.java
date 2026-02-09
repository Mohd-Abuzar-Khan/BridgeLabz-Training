package com.bankingsystem;

// Represents a single ATM transaction
class Transaction implements Runnable {

    private final BankAccount account; // Shared account
    private final String customerName;  // Customer name
    private final int amount;           // Withdrawal amount

    public Transaction(BankAccount account, String customerName, int amount) {
        this.account = account;
        this.customerName = customerName;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println("Thread state before run: " + Thread.currentThread().getState());
        account.withdraw(customerName, amount);
    }
}
