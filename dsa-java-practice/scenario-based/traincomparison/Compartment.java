package traincomparison;

class Compartment {
	String compartmentNumber;
	boolean pantry;
	boolean wifi;
	Compartment prev;
	Compartment next;

	// Parameterized constructor
	public Compartment(String compartmentNumber, boolean pantry, boolean wifi) {

		this.compartmentNumber = compartmentNumber;
		this.pantry = pantry;
		this.wifi = wifi;
		this.prev = null;
		this.next = null;
	}
	
	// Displaying All Compartment details
		void displayCompartment(Compartment temp) {

			System.out.println("Compartment No -> " + temp.compartmentNumber);
			System.out.println("Is pantry available -> " + temp.pantry);
			System.out.println("Is Wifi available -> " + temp.wifi);

		}

		// Displaying Compartment details to go forward or backward
		
		

		
		
}
