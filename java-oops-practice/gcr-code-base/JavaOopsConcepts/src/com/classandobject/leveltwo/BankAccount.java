package com.classandobject.leveltwo;

public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountHolder, String accountNumber, double balance ) {
    	this.accountHolder=accountHolder;
    	this.accountNumber=accountNumber;
    	this.balance=balance;
    	
    }
    public static void displayBank() {
    	System.out.println("State Bank of India");
    }
    public void deposit(double amount) {
    	if(amount >0) {
    		balance+=amount;
    		System.out.println("Deposited : "+balance);
    	}
    	else {
    		System.out.println("amount must be positive");
    	}
    }
    
    public void withdraw(double amount) {
    	if (amount <= balance && amount > 0) {
			balance -= amount;
			System.out.println("Withdraw amount is : "+amount);
		}
		else if (amount <= 0) {
			System.out.println("Withdrawal amount must be positive");
		}
		else {
			System.out.println("Insufficient balance");
		}

    }
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }


    // Main method for testing
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("Lynda", "123456789", 700.00);
       
        //Display the Bank name
        displayBank();
       
        // Performing multiple operation in the account
        account.displayBalance();
        account.deposit(200.00);
        account.displayBalance();
        account.withdraw(100.00);
        account.displayBalance();
        account.withdraw(900.00);
    }
}