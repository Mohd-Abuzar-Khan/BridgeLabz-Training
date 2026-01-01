package com.objectmodeling.bankmanagement;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Account> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.accounts = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    // Association: Bank opens account for customer
    public Account openAccount(Customer customer, int accountNumber, double balance) {
        Account account = new Account(accountNumber, balance, this);
        accounts.add(account);
        customer.addAccount(account);
        return account;
    }

    public void showAllAccounts() {
        System.out.println("\nAccounts in " + bankName + ":");
        for (Account acc : accounts) {
            acc.displayAccountInfo();
        }
    }
}
