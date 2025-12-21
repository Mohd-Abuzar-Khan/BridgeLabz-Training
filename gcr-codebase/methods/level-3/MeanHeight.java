// Create MeanHeight class to find shortest, tallest and mean height
public class MeanHeight {

	// Method to generate random heights
	public static int[] generateHeights(int size) {

		int[] heights = new int[size];

		for (int i = 0; i < size; i++) {
			heights[i] = 150 + (int)(Math.random() * 101);
		}
		return heights;
	}

	// Method to find sum of heights
	public static int findSum(int[] heights) {

		int sum = 0;
		for (int i = 0; i < heights.length; i++) {
			sum += heights[i];
		}
		return sum;
	}

	// Method to find mean height
	public static double findMean(int sum, int count) {
		return (double) sum / count;
	}

	// Method to find shortest height
	public static int findShortest(int[] heights) {

		int shortest = heights[0];
		for (int i = 1; i < heights.length; i++) {
			if (heights[i] < shortest) {
				shortest = heights[i];
			}
		}
		return shortest;
	}

	// Method to find tallest height
	public static int findTallest(int[] heights) {

		int tallest = heights[0];
		for (int i = 1; i < heights.length; i++) {
			if (heights[i] > tallest) {
				tallest = heights[i];
			}
		}
		return tallest;
	}

	public static void main(String[] args) {

		int teamSize = 11;

		// Generate heights
		int[] heights = generateHeights(teamSize);

		// Display heights
		System.out.println("Heights of Football Players:");
		for (int i = 0; i < heights.length; i++) {
			System.out.print(heights[i] + " ");
		}

		// Calculations
		int sum = findSum(heights);
		double mean = findMean(sum, teamSize);
		int shortest = findShortest(heights);
		int tallest = findTallest(heights);

		// Display results
		System.out.println("\n\nShortest Height: " + shortest + " cm");
		System.out.println("Tallest Height: " + tallest + " cm");
		System.out.println("Mean Height: " + mean + " cm");
	}
}