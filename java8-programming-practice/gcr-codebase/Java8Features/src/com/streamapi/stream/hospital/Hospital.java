package com.streamapi.stream.hospital;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Hospital {
	 public static void main(String[] args) {

	        List<Doctor> list = new ArrayList<>();

	        list.add(new Doctor("Dr A", "Cardiology", true));
	        list.add(new Doctor("Dr B", "Neurology", false));
	        list.add(new Doctor("Dr C", "Dermatology", true));
	        list.add(new Doctor("Dr D", "Orthopedics", true));

	        Comparator<Doctor> specialtySort =
	                (d1, d2) -> d1.speciality.compareTo(d2.speciality);
	                
	       System.out.println("List of Doctor");
	       list.stream().forEach(System.out::println);

	       Stream<Doctor> str = list.stream()
					.filter(d -> (d.availableOnWeekend))
					.sorted(specialtySort);

			System.out.println("****************************************");
			System.out.println("Doctors available on weekends and sort by specialty ");
			str.forEach(System.out::println);
	 }
}
