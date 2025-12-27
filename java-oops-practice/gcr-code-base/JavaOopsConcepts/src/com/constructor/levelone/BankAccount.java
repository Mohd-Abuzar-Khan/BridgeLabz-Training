package com.constructor.levelone;

public class BankAccount {
	
	public String accountNumber;
	protected String accountHolder;
	private double balance;
	
	// Constructor
	BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
	
	public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount.");
        }
    }
    
}
