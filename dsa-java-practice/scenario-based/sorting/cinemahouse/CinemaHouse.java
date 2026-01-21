package sorting.cinemahouse;

public class CinemaHouse {
	
	public static void bubbleSort(int[] showTimes) {
		for(int i = 0; i < showTimes.length - 1; i++) {
			
			for(int j = 0; j < showTimes.length - i - 1; j++ ) {
				
				if(showTimes[j] > showTimes[j + 1]) {
					int temp = showTimes[j];
					showTimes[j] = showTimes[j + 1];
					showTimes[j + 1] = temp;
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		int[] showTimes = { 100 , 150, 75, 30, 210, 15, 65};
		
		bubbleSort(showTimes);
		
		for(int num : showTimes) {
			System.out.print(num + " ");
		}
	}

}
