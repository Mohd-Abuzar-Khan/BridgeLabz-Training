package com.inheritance.hierarchicalinheritance.bankingsystem;

public class Main {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount("S9L01", 50000, 4.5);
        CheckingAccount ca = new CheckingAccount("R0D20", 30000, 10000);
        FixedDepositAccount fda = new FixedDepositAccount("FD301", 100000, 5);

        sa.displayDetails();
        sa.displayAccountType();

        System.out.println();

        ca.displayDetails();
        ca.displayAccountType();

        System.out.println();

        fda.displayDetails();
        fda.displayAccountType();
    }
}
