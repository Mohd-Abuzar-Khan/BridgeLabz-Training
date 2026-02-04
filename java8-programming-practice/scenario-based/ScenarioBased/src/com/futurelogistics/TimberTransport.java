package com.futurelogistics;

public class TimberTransport extends GoodTransports{
	private float timberLength;
	private float timberRadius;
	private String timberType;
	private float timberPrice;
	
	
	public float calculatingVehiclePrice() {
		String vehicle = vehicleSelection();
		if(vehicle.equals("Truck")){
			return 1700.0f;
		} else if(vehicle.equals("Lorry")){
			return 1000.0f;
		} 
		return 3000.0f;
	}
	
	
	public TimberTransport(String transportId, String transportDate, int transportRating, float timberLength,
			float timberRadius, String timberType, float timberPrice) {
		super(transportId, transportDate, transportRating);
		this.timberLength = timberLength;
		this.timberRadius = timberRadius;
		this.timberType = timberType;
		this.timberPrice = timberPrice;
	}


	public float discountPercentage(){
		if (transportRating == 5){
			return 0.20f;
		} else if(transportRating == 3 || transportRating == 4){
			return 0.10f;
		} 
		return 0;
	}
	
	
	public float isPremium(){
		if(timberType.equals("Premium")){
			return 0.25f;
		} 
			return 0.15f;
	}
	
	
	public void displayDetails(){
		System.out.println("Transporter id : " + transportId);
		System.out.println("Date of transport : " + transportDate);
		System.out.println("Rating of the transport : " + transportRating);
		System.out.println("Type of the timber : "  + timberType);
		System.out.println("Timber price per kilo : " + timberPrice);
		System.out.println("Vehicle for transport : " + vehicleSelection());		
		System.out.println("Total charge : " + calculateTotalCharge());
	}
	
	
	@Override
	public String vehicleSelection() {
		
		float area = areaOfTimber();
		
		if(area < 250){
			return "Truck";
		} else if( area >= 250 && area <= 400){
			return "Lorry";
		} 
		return "MonsterLorry";

	}
	
	private float areaOfTimber() {
		
		float area = 2 * 3.147f * timberRadius * timberLength;
		
		return area;
	}

	
	

	@Override
	public float calculateTotalCharge() {
		
		float volume = (float) 3.147 * timberRadius * timberRadius * timberLength;
		float premiumType = isPremium();
		float price = (volume * timberPrice) * premiumType ;
		float vehiclePrice = calculatingVehiclePrice();
		float tax = price * 0.3f;
		float discount = price * discountPercentage();
		float totalCharge = ((price) + vehiclePrice + tax) - discount;
					
		return totalCharge;
	}
}



