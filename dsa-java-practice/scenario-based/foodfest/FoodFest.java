package sorting.foodfest;

public class FoodFest {
	
	
	public static Stall[] stalls = new Stall[20];
	private static int numberOfStalls = 0;

	// Method to add Stall in list
	public static void addStall(String stallName, int count, String testCenter) {
		if (numberOfStalls < stalls.length) {
			Stall Stall = new Stall(stallName, count, testCenter);
			stalls[numberOfStalls] = Stall;
			numberOfStalls++;
		} else {
			System.out.println("Stall count list is full");
		}
	}

	// Method to display Stall Details
	public static void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println("Displaying Stall details");
		System.out.println("-------------------------------------------");
		System.out.println("Stall Name\t\tCount\tZone");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < stalls.length; i++) {
			System.out.println(stalls[i].stallName + "\t" + stalls[i].count + "\t" + stalls[i].zone);
		}
	}

	// ---------------------- Merge Sort (Stall) ----------------------

	// Main method to perform merge sort on stall
	public static void mergeSort(Stall[] arr, int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	private static void merge(Stall[] arr, int l, int m, int r) {
		// Find sizes of two sub arrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		// Create temp arrays

		Stall[] L = new Stall[n1];
		Stall[] R = new Stall[n2];

		// Copy data to temp arrays
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray
		int k = l;
		while (i < n1 && j < n2) {
			// Use compareTo() for date comparison
			if (L[i].zone.compareTo(R[j].zone) <= 0) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of L[] if any
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy remaining elements of R[] if any
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	// ------------------- Merge sort (count) ----------------------------

	public static void sortCount(Stall[] arr) {
		int i = 0;
		int j = 0;
		while (j < arr.length) {
			if (!arr[i].zone.equals(arr[j].zone)) {
				mergeSortcount(arr, i, j - 1);
				i = j;
			} else {
				j++;
			}
		}
		mergeSortcount(arr, i, j - 1);
	}

	public static void mergeSortcount(Stall[] arr, int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			mergeSortcount(arr, l, m);
			mergeSortcount(arr, m + 1, r);

			// Merge the sorted halves
			mergecount(arr, l, m, r);
		}
	}

	private static void mergecount(Stall[] arr, int l, int m, int r) {
		// Find sizes of two sub arrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		// Create temp arrays
		Stall[] L = new Stall[n1];
		Stall[] R = new Stall[n2];

		// Copy data to temp arrays
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray
		int k = l;
		while (i < n1 && j < n2) {
			// Use compareTo() for date comparison
			if (L[i].count <= R[j].count) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of L[] if any
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy remaining elements of R[] if any
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}


	
	public static void main(String[] args) {

		// Adding stalls to list
		addStall("Tea Corner	", 5, "Zone A");
		addStall("Snack Hub	", 8, "Zone B");
		addStall("Food Plaza	", 12, "Zone C");
		addStall("Coffee Point	", 6, "Zone A");
		addStall("Ice Cream Delight", 4, "Zone B");
		addStall("Burger Junction	", 10, "Zone C");
		addStall("Pizza Stop	", 9, "Zone A");
		addStall("South Indian Meals", 15, "Zone B");
		addStall("North Indian Tadka", 14, "Zone C");
		addStall("Chinese Wok	", 11, "Zone A");
		addStall("Juice Bar	", 3, "Zone B");
		addStall("Chat Corner	", 7, "Zone C");
		addStall("Sweet House	", 6, "Zone A");
		addStall("Biryani Palace	", 18, "Zone B");
		addStall("Momos Point	", 5, "Zone C");
		addStall("Sandwich Express	", 4, "Zone A");
		addStall("Milkshake Mania	", 6, "Zone B");
		addStall("Rolls & Wraps	", 9, "Zone C");
		addStall("Fried Snacks	", 8, "Zone A");
		addStall("Healthy Bites	", 5, "Zone B");

		// Calling method to sort and display stall in sorted order
		mergeSort(stalls, 0, numberOfStalls - 1);
		displayInfo();

		sortCount(stalls);
		displayInfo();
	}

}
