package com.lambda.hospitalapp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;


public class HospitalApp {
	public static void main(String[] args) {
		
		List<Alerts> alerts = new ArrayList<>();
		
		alerts.add(new Alerts("Morning Medicine","It's time for your Morning Medicine",true));
		alerts.add(new Alerts("Morning Walk","It's time for your Morning Walk",false));

		alerts.add(new Alerts("Evening Medicine","It's time for your Evening Medicine",true));
		alerts.add(new Alerts("Evening Walk","It's time for your Evening Walk",false));

		alerts.add(new Alerts("Night Medicine","It's time for your Night Medicine", true));
		alerts.add(new Alerts("Meditation","It's time for your Meditation", false));
		
		Predicate<Alerts> show = (p1) -> p1.show == true; 
		
		Consumer<Alerts> print = (c1) -> System.out.println(c1.message);
		
		System.out.print("[");
		for(Alerts al : alerts) {
			System.out.print(al.name + ", ");
		}
		System.out.println("]");



		
		for(Alerts al : alerts) {
			if(show.test(al)) {
				print.accept(al);
			}
		}

	}
}
