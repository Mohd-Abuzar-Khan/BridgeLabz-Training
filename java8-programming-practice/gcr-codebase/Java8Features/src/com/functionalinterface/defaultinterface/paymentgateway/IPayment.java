package com.functionalinterface.defaultinterface.paymentgateway;

public interface IPayment {
	
    void payment();

    default void payment(double price) {
        System.out.println("Payment successful of rupees: " + price);
    }
    
    default void refund(double price) {
        System.out.println("Refund for the last transaction of rupees: " + price);
    }
}
