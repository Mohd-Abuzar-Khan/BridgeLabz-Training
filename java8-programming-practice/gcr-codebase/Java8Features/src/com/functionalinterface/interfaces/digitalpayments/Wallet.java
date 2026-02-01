package com.functionalinterface.interfaces.digitalpayments;

public class Wallet implements IPayable{

	public void pay(double amount) {
        System.out.println("Succesfully Paid " + amount + " using Wallet");
    }
}