package sorting.medwarehouse;

import java.time.LocalDate;

public class MedWarehouse {
	
	static int listSize = 0;
	static Medicine[] medicineList = new Medicine[listSize];
	
	
	public static void addMedicine(String medicineName, LocalDate mfg, LocalDate expiry) {
		Medicine medicine = new Medicine(medicineName, mfg, expiry);
		if(listSize <= medicineList.length) {
			Medicine[] temp = new Medicine[++listSize];
			
			for(int j = 0; j < listSize - 1; j++) {
				temp[j] = medicineList[j];
			}
			
			temp[listSize - 1] = medicine;
			medicineList = temp;
//			listSize++;
			
			System.out.println("Successfully added Medicine " + medicine.medicineName );
		}
	}
	
	
	
	
	// Main method to perform merge sort on Medicine
		public static void mergeSort(Medicine[] arr, int l, int r) {
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
		
		
		
		
		
		private static void merge(Medicine[] arr, int l, int m, int r) {
			// Find sizes of two sub arrays to be merged
			int n1 = m - l + 1;
			int n2 = r - m;

			// Create temp arrays

			Medicine[] L = new Medicine[n1];
			Medicine[] R = new Medicine[n2];

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
				if (L[i].expiry.compareTo(R[j].expiry) <= 0) {
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
		
		
		// Method to display Medicine Details
		public static void displayInfo() {
			System.out.println("-------------------------------------------");
			System.out.println("Displaying Medicine details");
			System.out.println("----------------------------------------------------");
			System.out.println("Medicine Name\t\tMFG\t\tExpiry");
			System.out.println("----------------------------------------------------");
			for (int i = 0; i < medicineList.length; i++) {
				System.out.println(
						medicineList[i].medicineName + "\t\t" + medicineList[i].mfg + "\t" + medicineList[i].expiry);
			}
		}

		
		
	
	
	
	
	

	public static void main(String[] args) {

		// Adding medicine to list
		addMedicine("Paracetamol", LocalDate.of(2024, 1, 10), LocalDate.of(2026, 1, 9));
		addMedicine("Ibuprofen", LocalDate.of(2024, 2, 5), LocalDate.of(2026, 2, 4));
		addMedicine("Amoxicillin", LocalDate.of(2023, 12, 20), LocalDate.of(2025, 12, 19));
		addMedicine("Cetirizine", LocalDate.of(2024, 3, 1), LocalDate.of(2026, 2, 28));
		addMedicine("Azithromycin", LocalDate.of(2024, 1, 25), LocalDate.of(2026, 1, 24));
		addMedicine("Metformin", LocalDate.of(2023, 11, 15), LocalDate.of(2025, 11, 14));
		addMedicine("Pantoprazole", LocalDate.of(2024, 4, 10), LocalDate.of(2026, 4, 9));
		addMedicine("Omeprazole", LocalDate.of(2023, 10, 5), LocalDate.of(2025, 10, 4));
		addMedicine("Aspirin	", LocalDate.of(2024, 2, 18), LocalDate.of(2026, 2, 17));
		addMedicine("Dolo 650	", LocalDate.of(2024, 5, 2), LocalDate.of(2026, 5, 1));
		addMedicine("Cough Syrup", LocalDate.of(2024, 6, 1), LocalDate.of(2025, 11, 30));
		addMedicine("Vitamin C", LocalDate.of(2024, 1, 8), LocalDate.of(2027, 1, 7));
		addMedicine("Calcium Tablets", LocalDate.of(2023, 9, 12), LocalDate.of(2026, 9, 11));
		addMedicine("Antacid	", LocalDate.of(2024, 3, 20), LocalDate.of(2026, 3, 19));
		addMedicine("Insulin	", LocalDate.of(2024, 7, 1), LocalDate.of(2025, 6, 30));
		addMedicine("ORS Powder", LocalDate.of(2024, 8, 5), LocalDate.of(2026, 8, 4));
		addMedicine("Pain Relief Gel", LocalDate.of(2024, 2, 28), LocalDate.of(2026, 2, 27));
		addMedicine("Antifungal Cream", LocalDate.of(2024, 4, 15), LocalDate.of(2026, 4, 14));
		addMedicine("Multivitamin", LocalDate.of(2023, 12, 1), LocalDate.of(2026, 11, 30));
		addMedicine("Eye Drops", LocalDate.of(2024, 6, 10), LocalDate.of(2025, 12, 9));

		// Calling method to sort medicine list
		mergeSort(medicineList, 0, medicineList.length - 1);

		// Calling method to display medicine details
		displayInfo();
	}
	
}
