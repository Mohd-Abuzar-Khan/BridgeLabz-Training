package com.inheritance.hierarchicalinheritance.bankingsystem;

class FixedDepositAccount extends BankAccount {
    private int returnInYears;

    public FixedDepositAccount(String accountNumber, double balance, int tenureInYears) {
        super(accountNumber, balance);
        this.returnInYears = tenureInYears;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Tenure: " + returnInYears + " years");
    }
}

