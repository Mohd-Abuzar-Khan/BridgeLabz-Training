package com.futurelogistics;

public class Utility{
	
	public GoodTransports parseDetails(String input){
		
		GoodTransports transport = null;
		
		String[] attributes = input.split(":");
		
		boolean valid = false;
		
		if(validateTransportId(attributes[0])){
			
			valid = true;
			
		} else {
			System.out.println("Transport Id " + attributes[0] +" is invalid");
		}
		
		if(valid){
			if (attributes[3].equals("TimberTransport")){
				TimberTransport timber = new TimberTransport(attributes[0],attributes[1],Integer.parseInt(attributes[2]),Float.parseFloat(attributes[4]),Float.parseFloat(attributes[5]),attributes[6],Float.parseFloat(attributes[7]));
				transport = timber;
			} else {
				BrickTransport brick = new BrickTransport(attributes[0],attributes[1],Integer.parseInt(attributes[2]),Float.parseFloat(attributes[4]),Integer.parseInt(attributes[5]),Float.parseFloat(attributes[6]));
				transport = brick;
			}
		}
		
		return transport;
		
	}
	
	public boolean validateTransportId(String transportId){
		if(transportId.matches("[R][T][S][0-9]{3}[A-Z]{1}")){
			return true;
		} else {
			return false;
		}
	}
	
	public String findObjectType(GoodTransports goodsTransport){
		if(goodsTransport instanceof BrickTransport){
			return "BrickTransport";
		} else {
			return "TimberTransport";
		}
	}
	
}