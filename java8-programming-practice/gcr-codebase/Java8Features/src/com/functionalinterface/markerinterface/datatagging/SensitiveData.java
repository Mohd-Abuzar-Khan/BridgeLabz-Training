package com.functionalinterface.markerinterface.datatagging;

public class SensitiveData {
    public static void main(String[] args) {

        Object[] records = {
            new Customer("Rahul", "1234-5678-9012"),
            new Bank("9876543210", "HDFC0001234"),
            new Invoice("INV-2026-001")  
        };

        for (Object record : records) {
            Service.process(record);
        }
    }
}