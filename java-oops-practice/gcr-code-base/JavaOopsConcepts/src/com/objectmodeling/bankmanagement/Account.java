package com.objectmodeling.bankmanagement;

public class Account {
	
	// Private attributes
    private int accountNumber;
    private double balance;
    private Bank bank;
    
    // Constructor
    public Account(int accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    // Getter Method for getting account number
    public int getAccountNumber() {
        return accountNumber;
    }
    
    // Getter method for getting balance
    public double getBalance() {
        return balance;
    }

    // Getter method to get books
    public Bank getBank() {
        return bank;
    }

    public void displayAccountInfo() {
        System.out.println("Account No: " + accountNumber +
                " | Bank: " + bank.getBankName() +
                " | Balance: ₹" + balance);
    }
}

