package sorting.tailorshop;

import java.time.LocalDate;

public class Customer {
	
	protected String customerName;
	protected String clothType;
	LocalDate deliveryDate;
	protected int slipNumber;
	
	public Customer(String customerName, String clothType, LocalDate deliveryDate, int slipNumber) {
		super();
		this.customerName = customerName;
		this.clothType = clothType;
		this.deliveryDate = deliveryDate;
		this.slipNumber = slipNumber;
	}
	
}
