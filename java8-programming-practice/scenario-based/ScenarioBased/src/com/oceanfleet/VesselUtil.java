package com.oceanfleet;

import java.util.ArrayList;
import java.util.List;

public class VesselUtil {
	
	private List<Vessel> vesselList = new ArrayList<>();
	
	
	
	public void addVesselPerformance(Vessel vessel) {
		vesselList.add(vessel);
	}
	
	
	
	public Vessel getVesselById(String vesselId) {
		Vessel res = null;
		vesselList.stream().filter(x -> x.getVesselId() == vesselId).forEach(System.out::println);
		for(Vessel v : vesselList) {
			if(v.getVesselId().equals(vesselId)) {
				res = v;
			}
		}
		return res;
	}
	
	
	
	public List<Vessel> getHighPerformanceVessels(){
		List<Vessel> result = new ArrayList<>();
		
		double high = 0;
		
		for(Vessel v : vesselList) {
			if (v.getAverageSpeed() > high) {
				high = v.getAverageSpeed();
			} 
		} 
		
		for(Vessel v : vesselList) {
			if (v.getAverageSpeed() >= high) {
				result.add(v);
			} 
		} 
		
		return result;
	
		
	}
	
	
	
	public void toStrings(Vessel v) {
		System.out.println(v.getVesselId() + "|" + v.getVesselName() + "|" + v.getVesselType() + "|" + v.getAverageSpeed() + " knots");
	}

}
