package com.objectmodeling.levelone;


public class Account {

    private int accountNumber;
    private double balance;
    private Bank bank;

    public Account(int accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }

    public void displayAccountInfo() {
        System.out.println("Account No: " + accountNumber +
                " | Bank: " + bank.getBankName() +
                " | Balance: ₹" + balance);
    }
}

