package com.functionalinterface.staticinterface.dateformat;

import java.time.LocalDate;

public class DateFoematting {
	public static void main(String[] args) {

        LocalDate date = LocalDate.of(2026, 2, 2);

        System.out.println("Indian Format  : " + IDateFormatable.toIndianFormat(date));
        System.out.println("ISO Format      : " + IDateFormatable.toISOFormat(date));
	}
}
