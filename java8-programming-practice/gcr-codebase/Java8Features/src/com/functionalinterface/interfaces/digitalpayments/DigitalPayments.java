package com.functionalinterface.interfaces.digitalpayments;

public class DigitalPayments {
	
	public static void main(String[] args) {

		// Creating Payment objects
		IPayable p1 = new UPI();
		IPayable p2 = new Credit();
		IPayable p3 = new Wallet();

		//Calling methods 
		p1.pay(500);
		p2.pay(1200);
		p3.pay(300);
	}

}
