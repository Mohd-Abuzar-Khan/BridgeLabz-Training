package hospitalqueue;

//Main class
public class Hospital {

	static int numberOfPatient = 11; // Total number of patients
	static Patient[] patientQueue = new Patient[numberOfPatient]; // Array to store total patients
	static int i = 0;

	// Method to add patient in array
	static void addPatient(String name, int criticalLevel) {

		if (i < numberOfPatient) {
			Patient patient = new Patient(name, criticalLevel);
			patientQueue[i] = patient;
			i++;
		}

	}

	// Method to sort array of patients using bubble sort
	static void sortPatientQueue() {

		for (int i = 0; i < numberOfPatient; i++) {
			for (int j = i; j < numberOfPatient; j++) {

				if (patientQueue[i].criricalLevel < patientQueue[j].criricalLevel) {
					Patient temp = patientQueue[i];
					patientQueue[i] = patientQueue[j];
					patientQueue[j] = temp;

				}
			}

		}

	}

	// Method to display patient array
	static void displayPatientQueue() {
		System.out.println("-------------- Patients Details in bed Order -------------");
		for (int i = 0; i < numberOfPatient; i++) {
			Patient patient = patientQueue[i];
			System.out.println((i + 1) + ") " + patient.name + " Critical Level -> " + patient.criricalLevel);
		}
		System.out.println("-----------------------------------------");
	}

	public static void main(String[] args) {

		// Adding object of patients in array
		addPatient("Aman", 3);
		addPatient("Rohan", 10);
		addPatient("Sagar", 7);
		addPatient("Sohan", 8);
		addPatient("Rahul", 3);
		addPatient("Arif", 6);
		addPatient("Arman", 9);
		addPatient("Ramu", 5);
		addPatient("Rinu", 1);
		addPatient("Sonal", 9);
		addPatient("Mohan", 4);
		addPatient("Aman", 3);

		// Displaying Patient array before sorting
		System.out.println("---------------- Patients before sorting ----------------");
		displayPatientQueue();

		// Calling method to sort Patient array
		sortPatientQueue();

		// Displaying Patient array after sorting
		System.out.println("---------------- Patients After sorting ----------------");
		displayPatientQueue();

	}
}