package com.functionalinterface.interfaces.digitalpayments;

public class UPI  implements IPayable{

	  public void pay(double amount) {
	        System.out.println("Succesfully Paid " + amount + " using UPI");
	    }
}