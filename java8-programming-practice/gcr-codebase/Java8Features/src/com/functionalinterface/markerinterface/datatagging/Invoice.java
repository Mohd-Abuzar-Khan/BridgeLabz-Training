package com.functionalinterface.markerinterface.datatagging;

public class Invoice {

    private String invoiceId;

    public Invoice(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    @Override
    public String toString() {
        return "InvoiceNumber { id='" + invoiceId + "' }";
    }
}
