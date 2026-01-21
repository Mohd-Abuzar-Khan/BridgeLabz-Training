package sorting.fleetmanager;

public class FleetManager {

	// Method to apply merge sort on vehicle with respect to mileage
	static public Vehicle[] merge(Vehicle[] depot1, Vehicle[] result) {
		int tempSize = depot1.length + result.length;
		Vehicle[] temp = new Vehicle[tempSize]; 
		int i = 0;
		int j = 0;
		int k = 0;
		
		//Merging Two Vehicle array in temporary array in a sorted manner
		for (; k < tempSize; k++) {
			if (i >= depot1.length || j >= result.length) {
				break;
			}
			if (depot1[i].mileage < result[j].mileage) {
				temp[k] = depot1[i];
				i++;
			} else {
				temp[k] = result[j];
				j++;
			}

		}

		//Copying depot list if result get empty
		while (i < depot1.length && k < tempSize) {
			temp[k] = depot1[i];
			i++;
			k++;
		}

		//Copying result list if depot 1 get empty
		while (j < result.length && k < tempSize) {
			temp[k] = result[j];
			j++;
			k++;
		}

		//Returning merged array
		return temp;
	}

	//Method to display Vehicle list details
	public static void displayInfo(Vehicle[] result) {
		System.out.println("------------------------------------------------------------------");
		System.out.println("Brand\t\tModel\t\tMileage\t\tDepot");
		System.out.println("------------------------------------------------------------------");
		for (Vehicle v : result) {
			System.out.println(v.brand + "\t\t" + v.model + "\t" + "\t" + v.mileage + "\t\t" + v.depot);
		}
		System.out.println("------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		
		//Creating a vehicle array to store final merged list
		Vehicle[] result = new Vehicle[0];
		
		//Creating object of depot
		Depot depot1 = new Depot();
		
		//Adding vehicle into depot1 list
		depot1.addVehicle("Honda", "Activa", 35, "CentralDepot");
		depot1.addVehicle("Hero", "Splendor", 45, "CentralDepot");
		depot1.addVehicle("Bajaj", "Pulsar", 55, "CentralDepot");
		depot1.addVehicle("TVS", "Apache", 65, "CentralDepot");
		depot1.addVehicle("Yamaha", "FZ", 75, "CentralDepot");
		
		//Calling method to merge two vehicle list
		result = merge(depot1.vehicleList, result);
		
		//Calling method to display result list
		displayInfo(result);

		//Creating object of depot
		Depot depot2 = new Depot();
		
		//Adding vehicle into depot1 list
		depot2.addVehicle("Tata", "Ace", 18, "NorthDepot");
		depot2.addVehicle("Mahindra", "Bolero", 22, "NorthDepot");
		depot2.addVehicle("ALeyland", "Dost", 26, "NorthDepot");
		depot2.addVehicle("Isuzu", "D-Max", 50, "NorthDepot");
		depot2.addVehicle("Force", "Trax", 54, "NorthDepot");
		
		//Calling method to merge two vehicle list
		result = merge(depot2.vehicleList, result);
		
		//Calling method to display result list
		displayInfo(result);

		//Creating object of depot
		Depot depot3 = new Depot();
		
		//Adding vehicle into depot1 list
		depot3.addVehicle("Hyundai", "iLoad", 14, "SouthDepot");
		depot3.addVehicle("Toyota", "Innova", 16, "SouthDepot");
		depot3.addVehicle("Kia", "Carnival", 18, "SouthDepot");
		depot3.addVehicle("Ford", "Transit", 20, "SouthDepot");
		depot3.addVehicle("Mercedes", "Vito", 22, "SouthDepot");
		
		//Calling method to merge two vehicle list
		result = merge(depot3.vehicleList, result);
		
		//Calling method to display result list
		displayInfo(result);

	}

}