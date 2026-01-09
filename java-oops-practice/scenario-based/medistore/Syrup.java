package medistore;

import java.util.Date;

public class Syrup extends Medicine{
	
	private int quantity;

	public Syrup(String name, int price, Date expiryDate) {
		super(name, price, expiryDate);
		this.quantity = 10;
	}
	
	

}
