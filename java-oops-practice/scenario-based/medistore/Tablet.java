package medistore;

import java.util.Date;

public class Tablet extends Medicine{


	public Tablet(String name, int price, Date expiryDate) {
		super(name, price, expiryDate);
		super.quantity = 10; 
		// TODO Auto-generated constructor stub
	}
	
	public void  checkExpiry() {
		
	}

}
