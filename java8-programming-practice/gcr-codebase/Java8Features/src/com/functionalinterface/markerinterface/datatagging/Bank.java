package com.functionalinterface.markerinterface.datatagging;

public class Bank {
	 private String accountNumber;
	    private String ifscCode;

	    public Bank(String accountNumber, String ifscCode) {
	        this.accountNumber = accountNumber;
	        this.ifscCode = ifscCode;
	    }

	    @Override
	    public String toString() {
	        return "BankDetails { account='" + accountNumber + "', ifsc='" + ifscCode + "' }";
	    }
}
