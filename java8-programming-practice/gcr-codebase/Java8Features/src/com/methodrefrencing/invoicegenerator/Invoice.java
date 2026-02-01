package com.methodrefrencing.invoicegenerator;

public class Invoice {
	protected String transactionID;
	
	
	public Invoice(String transactionID) {
		this.transactionID = transactionID;
	}
	
	public String toString() {
        return "Invoice generated for transaction: " + transactionID;
    }
	
	

}
