package com.methodrefrencing.patientmanagment;

import java.util.ArrayList;
import java.util.List;

public class PatientManagmentSystem {
	public static void main(String[] args) {
		
		List<Paitent> listOfPaitent = new ArrayList<>();
		
		listOfPaitent.add(new Paitent("Abuzar", 7356));
		listOfPaitent.add(new Paitent("Ananya", 6534));
		listOfPaitent.add(new Paitent("Laxmi", 8754));
		listOfPaitent.add(new Paitent("Arif", 9835));
		
		System.out.println("Id's of Paitents : ");
		listOfPaitent.forEach(Paitent::printID);

	}

}
