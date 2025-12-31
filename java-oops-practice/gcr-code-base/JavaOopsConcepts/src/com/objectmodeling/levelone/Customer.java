package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("\nAccount details for " + name + ":");
        for (Account acc : accounts) {
            acc.displayAccountInfo();
        }
    }
}

