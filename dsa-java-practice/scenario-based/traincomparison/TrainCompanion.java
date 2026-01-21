package traincomparison;

public class TrainCompanion {
	
	
	
	

	
	public static void main(String[] args) {
		// Creating object of compartment
		Train train = new Train("A1", true, true);
		train.addCompartment("A2", true, false);
		train.addCompartment("A3", true, false);
		train.addCompartment("A4", false, false);
		train.addCompartment("A5", false, true);
		train.addCompartment("B1", true, false);
		train.addCompartment("B2", false, true);
		train.addCompartment("S1", true, false);
		train.addCompartment("S2", false, true);
		train.displayAdjecentCompartment();


		// Applying operation to move forward and backward & displaying adjacent
		// compartment details
		train.moveForward();
				
		//removing compartment
		train.removeCompartment("B2");
		train.displayAdjecentCompartment();
		train.moveForward();
		train.displayAdjecentCompartment();
		train.moveForward();
		train.displayAdjecentCompartment();
		train.moveForward();
		train.displayAdjecentCompartment();
		train.moveBackward();
		train.displayAdjecentCompartment();
		train.moveForward();
		train.displayAdjecentCompartment();
		train.moveBackward();
		train.displayAdjecentCompartment();
		train.moveBackward();
		train.displayAdjecentCompartment();
	}

}
