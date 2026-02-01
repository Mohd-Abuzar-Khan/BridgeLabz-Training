package com.functionalinterface.markerinterface.datatagging;

public class Customer implements ISensitiveData {
	private String name;
    private String aadhaarNumber;

    public Customer(String name, String aadhaarNumber) {
        this.name = name;
        this.aadhaarNumber = aadhaarNumber;
    }

    @Override
    public String toString() {
        return "CustomerRecord { name='" + name + "', aadhaar='" + aadhaarNumber + "' }";
    }
}
