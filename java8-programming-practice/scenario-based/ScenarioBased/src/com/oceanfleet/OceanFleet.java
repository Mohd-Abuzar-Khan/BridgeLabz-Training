package com.oceanfleet;

import java.util.List;
import java.util.Scanner;

public class OceanFleet {
	
	
	private static Vessel generateVessel(String[] arrStr) {
		Vessel temp = new Vessel(arrStr[0],arrStr[1], Double.parseDouble(arrStr[2]) , arrStr[3]);
		return temp;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		VesselUtil obj = new VesselUtil();
		
		System.out.println("Enter the number of vessels to be added");
		int n = sc.nextInt();
		
		System.out.println("Enter vessel details");
		sc.nextLine();
		
		for(int i = 0; i < n; i++) {
			
			String string = sc.nextLine();
			String[] arrStr = string.split(":");
			obj.addVesselPerformance(generateVessel(arrStr));
		}
		
		System.out.println("Enter the Vessel Id to check speed");
		String vesselId = sc.nextLine();
		Vessel v = obj.getVesselById(vesselId);
	
		try {
				obj.toStrings(v);
		} catch(NullPointerException e) {
			System.out.println("Vessel Id V004 not found");
		}
		
		
		System.out.println("High performance vessels are");
		List<Vessel> vesselList = obj.getHighPerformanceVessels();
		for(Vessel ves : vesselList) {
			obj.toStrings(ves);
		}
		
		sc.close();
	}


}
