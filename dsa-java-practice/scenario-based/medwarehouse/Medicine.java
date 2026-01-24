package sorting.medwarehouse;

import java.time.LocalDate;

//Class medicine to store medicine details
public class Medicine {
	String medicineName;
	LocalDate mfg;
	LocalDate expiry;

	// Parameterized Constructor
	public Medicine(String medicineName, LocalDate mfg, LocalDate expiry) {
		this.medicineName = medicineName;
		this.mfg = mfg;
		this.expiry = expiry;
	}

}