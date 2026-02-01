package com.functionalinterface.defaultinterface.paymentgateway;

public class PaymentGateWay {
	public static void main(String[] args) {

        IPayment p = () -> System.out.println("Payment Gateway is Established");

        p.payment();

        p.payment(200);
        p.payment(5000);

        p.refund(200);
        p.refund(5000);
    }
}
