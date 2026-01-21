package sorting.fleetmanager;

//Depot class to store list of Vehicle in a depot
public class Depot {
	public int listSize = 0;
	public Vehicle[] vehicleList = new Vehicle[listSize];

	// Method to add vehicle to array list
	public void addVehicle(String brand, String model, int mileage, String depot) {
		Vehicle vehicle = new Vehicle(brand, model, mileage, depot);
		if (this.listSize <= this.vehicleList.length) {
			Vehicle[] temp = new Vehicle[++this.listSize];
			for (int i = 0; i < listSize - 1; i++) {
				temp[i] = this.vehicleList[i];
			}
			temp[listSize - 1] = vehicle;
			this.vehicleList = temp;
			System.out.println(listSize + ") Vehicle added to " + depot + " depot list successfully ");
		}

	}
}