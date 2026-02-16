package com.collections.mapinterface.basicproblem;

import java.util.Scanner;

public class RobotHazardAuditor{
	
	public static double CalculateHazardRisk(double armPrecision, int workerDensity, String machineryState) throws RobotSafetyException {
		
		if(armPrecision < 0.0 || armPrecision > 1.0){
			throw new RobotSafetyException("Error: Arm precision must be 0.0-1.0");
		}
		
		if(workerDensity < 1 || workerDensity > 20){
			throw new RobotSafetyException("Error: Worker density must be 1-20");
		}
		
		double machineRiskFactor = 0;
		
		if(machineryState.equalsIgnoreCase("Worn")){
			machineRiskFactor = 1.0;
		}else if (machineryState.equalsIgnoreCase("Faulty")){
			machineRiskFactor = 2.0;
		} else if (machineryState.equalsIgnoreCase("Critical")){
			machineRiskFactor = 3.0;
		} else{
			throw new RobotSafetyException("Error: Unsupported machinery state");
		}
		
		double HazardRisk = ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);
		
		return HazardRisk;

	}

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter Arm Precision (0.0 - 1.0):");
		double armPrecision = sc.nextDouble();
		
		System.out.println("Enter Worker Density (1 - 20):");
		int workerDensity = (int) sc.nextDouble();

	
		System.out.println("Enter Machinery State (Worn/Faulty/Critical):");
		String machineryState = sc.next();
		
		try {
		double ans = CalculateHazardRisk( armPrecision,  workerDensity, machineryState);
		System.out.println("Robot Hazard Risk Score: " + ans);
		} catch (RobotSafetyException e) {
			System.err.println(e.getMessage());
		}
		
		
	}
}
