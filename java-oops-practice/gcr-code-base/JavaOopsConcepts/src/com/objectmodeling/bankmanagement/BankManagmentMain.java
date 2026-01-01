package com.objectmodeling.bankmanagement;

public class BankManagmentMain {
	

    public static void main(String[] args) {

        Bank sbi = new Bank("SBI");
        Bank hdfc = new Bank("HDFC");

        Customer ravi = new Customer("Ravi");
        Customer nitin = new Customer("Nitin");

        // Opening accounts
        sbi.openAccount(ravi, 101, 50000);
        hdfc.openAccount(ravi, 102, 75000);

        sbi.openAccount(nitin, 103, 30000);

        // Viewing balances
        ravi.viewBalance();
        nitin.viewBalance();

        // Bank view
        sbi.showAllAccounts();
        hdfc.showAllAccounts();
    }
}
