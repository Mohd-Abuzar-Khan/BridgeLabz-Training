package com.functionalinterface.staticinterface.dateformat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface IDateFormatable {

	    void format();

	    static String toIndianFormat(LocalDate date) {
	        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	    }

	    static String toISOFormat(LocalDate date) {
	        return date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	    }

}
