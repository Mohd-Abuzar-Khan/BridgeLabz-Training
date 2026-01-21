package sorting.cropmonitor;

public class CropMonitor {
	
	public static void quickSort(int[] timestamps, int low, int high) {
		
		if (low < high) 
		{
			int pivotIndex = partition(timestamps, low, high);
			
			quickSort(timestamps, low, pivotIndex - 1);
			
			quickSort(timestamps, pivotIndex + 1, high);
		}
		
	}

	private static int partition(int[] timestamps, int low, int high) {
		// TODO Auto-generated method stub
		int pivot = timestamps[high];
		
		int i = low -1 ;
		
		for(int j = low; j < high; j++ ) {
			
			if(timestamps[j] <= pivot) {
				
				i++;
				
				int temp = timestamps[i];
				timestamps[i] = timestamps[j];
				timestamps[j] = temp;
			}
			
			int temp = timestamps[i + 1];
			timestamps[i + 1] = timestamps[high];
			timestamps[high] = temp;

		}
		
		return (i + 1);
		
	}
	
	// Main method to sort sensor data
		public static void main(String[] args) {

			// Unordered sensor time stamps collected from drones
			int[] timestamps = { 105, 320, 210, 450, 150, 90, 300 };

			// Apply quick sort for fast ordering
			quickSort(timestamps, 0, timestamps.length - 1);

			// Display sorted sensor time stamps
			for (int time : timestamps) {
				System.out.print(time + " ");
			}
		}

}
