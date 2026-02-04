package com.futurelogistics;


public class BrickTransport extends GoodTransports{
	private float brickSize;
	private int brickQunatity;
	private float brickPrice;
	
	
	public float calculatingVehiclePrice() {
		String vehicle = vehicleSelection();
		if(vehicle.equals("Truck")){
			return 1700.0f;
		} else if(vehicle.equals("Lorry")){
			return 1000.0f;
		} 
		return 3000.0f;
	}
	

	public BrickTransport(String transportId, String transportDate, int transportRating, float brickSize,
			int brickQunatity, float brickPrice) {
		super(transportId, transportDate, transportRating);
		this.brickSize = brickSize;
		this.brickQunatity = brickQunatity;
		this.brickPrice = brickPrice;
	}



	public void displayDetails(){
		System.out.println("Transporter id : " + transportId);
		System.out.println("Date of transport : " + transportDate);
		System.out.println("Rating of the transport : " + transportRating);
		System.out.println("Quantity of bricks : "  + brickQunatity);
		System.out.println("Brick price : " + brickPrice);
		System.out.println("Vehicle for transport : " + vehicleSelection());		
		System.out.println("Total charge : " + calculateTotalCharge());
	}
	
	
	
	public float discountPercentage(){
		if (transportRating == 5){
			return 0.2f;
		} else if(transportRating == 3 || transportRating == 4){
			return 0.1f;
		} else if ( transportRating == 1 || transportRating == 2){
			return 0;
		}
		return 0;
	}
	
	
	@Override
	public String vehicleSelection() {
		if(brickQunatity < 300){
			return "Truck";
		} else if( brickQunatity >= 300 && brickQunatity <= 500){
			return "Lorry";
		} 
		return "MonsterLorry";
	}
	
	@Override
	public float calculateTotalCharge() {
		float price = brickPrice * brickQunatity;
		float vehiclePrice = calculatingVehiclePrice();
		float tax = price * 0.3f;
		float discount = price * discountPercentage();
		float totalCharge = (price + vehiclePrice + tax) - discount;
		
		return totalCharge;
	}


	public float getBrickSize() {
		return brickSize;
	}


	public void setBrickSize(float brickSize) {
		this.brickSize = brickSize;
	}
}