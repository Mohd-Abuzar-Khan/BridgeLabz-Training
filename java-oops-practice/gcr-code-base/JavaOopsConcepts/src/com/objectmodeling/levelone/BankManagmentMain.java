package com.objectmodeling.levelone;

public class BankManagmentMain {
	

    public static void main(String[] args) {

        Bank sbi = new Bank("SBI");
        Bank hdfc = new Bank("HDFC");

        Customer rohan = new Customer("Rohan");
        Customer neha = new Customer("Neha");

        // Opening accounts
        sbi.openAccount(rohan, 101, 50000);
        hdfc.openAccount(rohan, 102, 75000);

        sbi.openAccount(neha, 103, 30000);

        // Viewing balances
        rohan.viewBalance();
        neha.viewBalance();

        // Bank view
        sbi.showAllAccounts();
        hdfc.showAllAccounts();
    }
}
