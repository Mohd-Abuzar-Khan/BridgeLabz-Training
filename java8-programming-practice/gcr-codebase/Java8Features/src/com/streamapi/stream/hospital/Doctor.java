package com.streamapi.stream.hospital;

public class Doctor {

	String name;
	String speciality;
	boolean availableOnWeekend;

    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.speciality = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }


	@Override
	public String toString() {
		return "Doctor [name=" + name + ", availability=" + availableOnWeekend + ", speciality=" + speciality + "]";
	}
}
