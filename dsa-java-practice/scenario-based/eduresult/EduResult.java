package sorting.eduresult;

public class EduResult {
	
	
	public static Student[] scoreList = new Student[20];
	private static int index = 0;
	
	// Method to add student score
	public static void addStudent(String name, int score, String testCenter) {
		if(index < scoreList.length) {
			Student student = new Student(name, score, testCenter);
			scoreList[index] = student;
			
			index++;
		} else {
			System.out.println("List is full");
		}
	}
	
	public static void displayInfo() {
		System.out.println("-------------------------->");
		System.out.println("Displaying Student details");
		System.out.println("--------------------------------");
		System.out.println("Name\tScore\tDistrict");
		System.out.println("--------------------------------");
		for (int i = 0; i < scoreList.length; i++) {
			System.out.println(scoreList[i].name + "\t" + scoreList[i].score + "\t" + scoreList[i].district);
		}
		
	}
	
	
	
	
	// ---------------------- Merge Sort (State) ----------------------

	// Main method to perform merge sort on States
	public static void mergeSort(Student[] arr, int l, int r) {
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

	private static void merge(Student[] arr, int l, int m, int r) {
		// Find sizes of two sub arrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		// Create temp arrays

		Student[] L = new Student[n1];
		Student[] R = new Student[n2];

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
			if (L[i].district.compareTo(R[j].district) <= 0) {
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

	// ------------------- Merge sort (Score) ----------------------------

	public static void sortScore(Student[] arr) {
		int i = 0;
		int j = 0;
		while (j < arr.length) {
			if (!arr[i].district.equals(arr[j].district)) {
				mergeSortScore(arr, i, j - 1);
				i = j;
			} else {
				j++;
			}
		}
		mergeSortScore(arr, i, j - 1);
	}

	public static void mergeSortScore(Student[] arr, int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = (l + r) / 2;

			// Sort first and second halves
			mergeSortScore(arr, l, m);
			mergeSortScore(arr, m + 1, r);

			// Merge the sorted halves
			mergeScore(arr, l, m, r);
		}
	}

	private static void mergeScore(Student[] arr, int l, int m, int r) {
		// Find sizes of two sub arrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		// Create temp arrays
		Student[] L = new Student[n1];
		Student[] R = new Student[n2];

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
			if (L[i].score <= R[j].score) {
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
		// Adding Student object to array
		addStudent("Abuzar", 180, "Rewa");
		addStudent("Rahul", 165, "Ranchi");
		addStudent("Sneha", 172, "Dhanbad");
		addStudent("Amit", 158, "Bokaro");
		addStudent("Pooja", 190, "Bokaro");
		addStudent("Rohan", 145, "Ranchi");
		addStudent("Neha", 168, "Dhanbad");
		addStudent("Vikas", 155, "Tata");
		addStudent("Anjali", 182, "Tata");
		addStudent("Karan", 160, "Ranchi");
		addStudent("Priya", 175, "Bokaro");
		addStudent("Suresh", 140, "Tata");
		addStudent("Nikita", 188, "Dhanbad");
		addStudent("Manish", 150, "Ranchi");
		addStudent("Kavita", 170, "Tata");
		addStudent("Deepak", 162, "Tata");
		addStudent("Ritu", 185, "Bokaro");
		addStudent("Akash", 148, "Dhanbad");
		addStudent("Meena", 178, "Tata");
		addStudent("Sanjay", 155, "Ranchi");

		// Diaplying student information
				displayInfo();
				System.out.println("Student score District wise");
				mergeSort(scoreList, 0, 19); // Calling method to sort record according to test center
				displayInfo();
				System.out.println("Student score District wise sorted");
				sortScore(scoreList); // Calling method to sort record accoriding to scores
				displayInfo();
	}

}
