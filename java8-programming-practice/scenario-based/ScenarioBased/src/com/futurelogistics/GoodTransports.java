package com.futurelogistics;

public abstract class GoodTransports{
	protected String transportId;
	protected String transportDate;
	protected int transportRating;
		
	abstract String vehicleSelection();
	
	public GoodTransports(String transportId, String transportDate, int transportRating) {
		this.transportId = transportId;
		this.transportDate = transportDate;
		this.transportRating = transportRating;
	}

	abstract float calculateTotalCharge();

}